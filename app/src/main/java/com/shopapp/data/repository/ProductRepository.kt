package com.shopapp.data.repository

import com.shopapp.data.database.dao.ProductDao
import com.shopapp.data.database.dao.ProductImageDao
import com.shopapp.data.database.entity.ProductEntity
import com.shopapp.data.database.entity.ProductImageEntity
import com.shopapp.data.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductRepository @Inject constructor(
    private val productDao: ProductDao,
    private val productImageDao: ProductImageDao
) {
    
    fun getAllActiveProducts(): Flow<List<Product>> = 
        productDao.getAllActiveProducts().map { entities ->
            entities.map { entity -> mapEntityToModel(entity) }
        }
    
    fun getProductsByCategory(categoryId: String): Flow<List<Product>> = 
        productDao.getProductsByCategory(categoryId).map { entities ->
            entities.map { entity -> mapEntityToModel(entity) }
        }
    
    fun getFeaturedProducts(limit: Int = 10): Flow<List<Product>> = 
        productDao.getFeaturedProducts(limit).map { entities ->
            entities.map { entity -> mapEntityToModel(entity) }
        }
    
    fun getSaleProducts(limit: Int = 10): Flow<List<Product>> = 
        productDao.getSaleProducts(limit).map { entities ->
            entities.map { entity -> mapEntityToModel(entity) }
        }
    
    suspend fun getProductById(productId: String): Product? {
        val entity = productDao.getProductById(productId)
        return entity?.let { mapEntityToModel(it) }
    }
    
    suspend fun searchProducts(searchQuery: String): List<Product> {
        val entities = productDao.searchProducts(searchQuery)
        return entities.map { entity -> mapEntityToModel(entity) }
    }
    
    fun getProductsByRating(minRating: Float): Flow<List<Product>> = 
        productDao.getProductsByRating(minRating).map { entities ->
            entities.map { entity -> mapEntityToModel(entity) }
        }
    
    fun getProductsByPriceRange(minPrice: Double, maxPrice: Double): Flow<List<Product>> = 
        productDao.getProductsByPriceRange(minPrice, maxPrice).map { entities ->
            entities.map { entity -> mapEntityToModel(entity) }
        }
    
    suspend fun insertProduct(product: Product): Result<Unit> {
        return try {
            val entity = mapModelToEntity(product)
            productDao.insertProduct(entity)
            
            // Insert product images
            if (product.imageUrls.isNotEmpty()) {
                val imageEntities = product.imageUrls.mapIndexed { index, url ->
                    ProductImageEntity(
                        imageId = "${product.id}_image_$index",
                        productId = product.id,
                        imageUrl = url,
                        sortOrder = index,
                        isPrimary = index == 0
                    )
                }
                productImageDao.insertImages(imageEntities)
            }
            
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun updateProductStock(productId: String, stockQuantity: Int): Result<Unit> {
        return try {
            productDao.updateProductStock(productId, stockQuantity)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun updateProductRating(productId: String, rating: Float, reviewCount: Int): Result<Unit> {
        return try {
            productDao.updateProductRating(productId, rating, reviewCount)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun deleteProduct(productId: String): Result<Unit> {
        return try {
            productDao.deleteProductById(productId)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun getProductImages(productId: String): List<String> {
        return productImageDao.getImagesByProductId(productId).map { it.imageUrl }
    }
    
    private suspend fun mapEntityToModel(entity: ProductEntity): Product {
        val imageUrls = productImageDao.getImagesByProductId(entity.productId).map { it.imageUrl }
        
        return Product(
            id = entity.productId,
            name = entity.name,
            description = entity.description,
            price = entity.price,
            originalPrice = entity.originalPrice,
            imageUrls = imageUrls,
            category = entity.categoryId,
            stock = entity.stockQuantity,
            rating = entity.rating,
            reviewCount = entity.reviewCount,
            isOnSale = entity.isOnSale,
            discountPercentage = entity.discountPercentage,
            createdAt = entity.createdAt
        )
    }
    
    private fun mapModelToEntity(model: Product): ProductEntity {
        return ProductEntity(
            productId = model.id,
            name = model.name,
            description = model.description,
            price = model.price,
            originalPrice = model.originalPrice,
            categoryId = model.category,
            stockQuantity = model.stock,
            rating = model.rating,
            reviewCount = model.reviewCount,
            isOnSale = model.isOnSale,
            discountPercentage = model.discountPercentage,
            createdAt = model.createdAt
        )
    }
}
