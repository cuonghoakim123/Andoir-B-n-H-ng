package com.shopapp.data.database

import com.shopapp.data.database.entity.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseSeeder @Inject constructor(
    private val database: AppDatabase
) {
    
    suspend fun seedDatabase() = withContext(Dispatchers.IO) {
        try {
            android.util.Log.d("DatabaseSeeder", "Starting database seeding...")

            // Always seed users (check if demo user exists)
            val demoUser = database.userDao().getUserById("user_demo")
            if (demoUser == null) {
                android.util.Log.d("DatabaseSeeder", "Demo user not found, seeding users...")
                seedUsers()
            } else {
                android.util.Log.d("DatabaseSeeder", "Demo user already exists: ${demoUser.fullName}")
            }

            // Check if other data already exists
            val categoryCount = database.categoryDao().getActiveCategoryCount()
            if (categoryCount > 0) {
                android.util.Log.d("DatabaseSeeder", "Categories already exist, skipping product seeding")
                return@withContext
            }

            android.util.Log.d("DatabaseSeeder", "Seeding categories and products...")
            seedCategories()
            seedProducts()
            seedProductImages()
            android.util.Log.d("DatabaseSeeder", "Database seeding completed!")
        } catch (e: Exception) {
            android.util.Log.e("DatabaseSeeder", "Error seeding database: ${e.message}", e)
            e.printStackTrace()
        }
    }

    private suspend fun seedUsers() {
        val users = listOf(
            UserEntity(
                userId = "user_demo",
                email = "cuonghotran17022004@gmail.com",
                passwordHash = "demo_password_hash",
                fullName = "Nguyễn Cường",
                phoneNumber = "0356012250",
                address = "Hà Nội, Việt Nam",
                avatarUrl = null,
                isVerified = true,
                createdAt = System.currentTimeMillis(),
                updatedAt = System.currentTimeMillis()
            )
        )

        android.util.Log.d("DatabaseSeeder", "Inserting ${users.size} users...")
        database.userDao().insertAll(users)
        android.util.Log.d("DatabaseSeeder", "Users inserted successfully!")
    }

    private suspend fun seedCategories() {
        val categories = listOf(
            CategoryEntity(
                categoryId = "cat_1",
                name = "Điện thoại",
                description = "Smartphone và điện thoại di động",
                iconUrl = "https://example.com/phone_icon.png",
                color = "#2196F3",
                sortOrder = 1
            ),
            CategoryEntity(
                categoryId = "cat_2",
                name = "Laptop",
                description = "Máy tính xách tay và phụ kiện",
                iconUrl = "https://example.com/laptop_icon.png",
                color = "#4CAF50",
                sortOrder = 2
            ),
            CategoryEntity(
                categoryId = "cat_3",
                name = "Thời trang",
                description = "Quần áo và phụ kiện thời trang",
                iconUrl = "https://example.com/fashion_icon.png",
                color = "#FF5722",
                sortOrder = 3
            ),
            CategoryEntity(
                categoryId = "cat_4",
                name = "Gia dụng",
                description = "Đồ gia dụng và nội thất",
                iconUrl = "https://example.com/home_icon.png",
                color = "#FF9800",
                sortOrder = 4
            ),
            CategoryEntity(
                categoryId = "cat_5",
                name = "Sách",
                description = "Sách và văn phòng phẩm",
                iconUrl = "https://example.com/book_icon.png",
                color = "#9C27B0",
                sortOrder = 5
            )
        )
        
        database.categoryDao().insertCategories(categories)
    }
    
    private suspend fun seedProducts() {
        val products = listOf(
            // Điện thoại
            ProductEntity(
                productId = "prod_1",
                name = "iPhone 15 Pro Max 256GB",
                description = "iPhone 15 Pro Max với chip A17 Pro mạnh mẽ, camera 48MP chuyên nghiệp và pin lâu dài. Thiết kế titanium cao cấp.",
                price = 29990000.0,
                originalPrice = 34990000.0,
                categoryId = "cat_1",
                stockQuantity = 50,
                sku = "IP15PM256",
                brand = "Apple",
                rating = 4.8f,
                reviewCount = 150,
                isFeatured = true,
                isOnSale = true,
                discountPercentage = 15
            ),
            ProductEntity(
                productId = "prod_2",
                name = "Samsung Galaxy S24 Ultra",
                description = "Galaxy S24 Ultra với S Pen tích hợp, camera 200MP và màn hình Dynamic AMOLED 2X 6.8 inch.",
                price = 26990000.0,
                originalPrice = 29990000.0,
                categoryId = "cat_1",
                stockQuantity = 30,
                sku = "SGS24U",
                brand = "Samsung",
                rating = 4.7f,
                reviewCount = 89,
                isFeatured = true,
                isOnSale = true,
                discountPercentage = 10
            ),
            
            // Laptop
            ProductEntity(
                productId = "prod_3",
                name = "MacBook Pro M3 14 inch",
                description = "MacBook Pro 14 inch với chip M3, màn hình Liquid Retina XDR và thời lượng pin lên đến 18 giờ.",
                price = 45990000.0,
                originalPrice = 49990000.0,
                categoryId = "cat_2",
                stockQuantity = 25,
                sku = "MBP14M3",
                brand = "Apple",
                rating = 4.9f,
                reviewCount = 67,
                isFeatured = true,
                isOnSale = true,
                discountPercentage = 8
            ),
            ProductEntity(
                productId = "prod_4",
                name = "Dell XPS 13 Plus",
                description = "Dell XPS 13 Plus với Intel Core i7 thế hệ 12, màn hình 13.4 inch 4K và thiết kế siêu mỏng.",
                price = 35990000.0,
                originalPrice = 35990000.0,
                categoryId = "cat_2",
                stockQuantity = 20,
                sku = "DXPS13P",
                brand = "Dell",
                rating = 4.5f,
                reviewCount = 43,
                isFeatured = false,
                isOnSale = false,
                discountPercentage = 0
            ),
            
            // Thời trang
            ProductEntity(
                productId = "prod_5",
                name = "Áo Polo Nam Premium",
                description = "Áo polo nam chất liệu cotton cao cấp, form dáng hiện đại, phù hợp cho cả công sở và dạo phố.",
                price = 299000.0,
                originalPrice = 399000.0,
                categoryId = "cat_3",
                stockQuantity = 100,
                sku = "POLO001",
                brand = "Fashion Brand",
                rating = 4.3f,
                reviewCount = 234,
                isFeatured = false,
                isOnSale = true,
                discountPercentage = 25
            ),
            ProductEntity(
                productId = "prod_6",
                name = "Giày Sneaker Unisex",
                description = "Giày sneaker thời trang unisex, đế cao su êm ái, phù hợp cho mọi hoạt động hàng ngày.",
                price = 599000.0,
                originalPrice = 799000.0,
                categoryId = "cat_3",
                stockQuantity = 75,
                sku = "SNEAK001",
                brand = "Sport Brand",
                rating = 4.4f,
                reviewCount = 156,
                isFeatured = true,
                isOnSale = true,
                discountPercentage = 25
            ),
            
            // Gia dụng
            ProductEntity(
                productId = "prod_7",
                name = "Nồi Cơm Điện Cao Cấp 1.8L",
                description = "Nồi cơm điện thông minh với 8 chế độ nấu, lòng nồi chống dính và giữ ấm tự động.",
                price = 1299000.0,
                originalPrice = 1599000.0,
                categoryId = "cat_4",
                stockQuantity = 40,
                sku = "RICE001",
                brand = "Home Brand",
                rating = 4.6f,
                reviewCount = 89,
                isFeatured = false,
                isOnSale = true,
                discountPercentage = 19
            ),
            
            // Sách
            ProductEntity(
                productId = "prod_8",
                name = "Sách Lập Trình Android",
                description = "Hướng dẫn lập trình Android từ cơ bản đến nâng cao, bao gồm Kotlin và Java.",
                price = 199000.0,
                originalPrice = 199000.0,
                categoryId = "cat_5",
                stockQuantity = 60,
                sku = "BOOK001",
                brand = "Tech Publisher",
                rating = 4.7f,
                reviewCount = 78,
                isFeatured = false,
                isOnSale = false,
                discountPercentage = 0
            )
        )
        
        database.productDao().insertProducts(products)
    }
    
    private suspend fun seedProductImages() {
        val productImages = listOf(
            // iPhone 15 Pro Max
            ProductImageEntity("img_1_1", "prod_1", "https://example.com/iphone15_1.jpg", "iPhone 15 Pro Max", 0, true),
            ProductImageEntity("img_1_2", "prod_1", "https://example.com/iphone15_2.jpg", "iPhone 15 Pro Max", 1, false),
            
            // Samsung Galaxy S24 Ultra
            ProductImageEntity("img_2_1", "prod_2", "https://example.com/galaxy_s24_1.jpg", "Galaxy S24 Ultra", 0, true),
            ProductImageEntity("img_2_2", "prod_2", "https://example.com/galaxy_s24_2.jpg", "Galaxy S24 Ultra", 1, false),
            
            // MacBook Pro M3
            ProductImageEntity("img_3_1", "prod_3", "https://example.com/macbook_m3_1.jpg", "MacBook Pro M3", 0, true),
            ProductImageEntity("img_3_2", "prod_3", "https://example.com/macbook_m3_2.jpg", "MacBook Pro M3", 1, false),
            
            // Dell XPS 13
            ProductImageEntity("img_4_1", "prod_4", "https://example.com/dell_xps_1.jpg", "Dell XPS 13", 0, true),
            
            // Áo Polo
            ProductImageEntity("img_5_1", "prod_5", "https://example.com/polo_1.jpg", "Áo Polo Nam", 0, true),
            
            // Giày Sneaker
            ProductImageEntity("img_6_1", "prod_6", "https://example.com/sneaker_1.jpg", "Giày Sneaker", 0, true),
            
            // Nồi Cơm
            ProductImageEntity("img_7_1", "prod_7", "https://example.com/rice_cooker_1.jpg", "Nồi Cơm Điện", 0, true),
            
            // Sách
            ProductImageEntity("img_8_1", "prod_8", "https://example.com/android_book_1.jpg", "Sách Android", 0, true)
        )
        
        database.productImageDao().insertImages(productImages)
    }
}
