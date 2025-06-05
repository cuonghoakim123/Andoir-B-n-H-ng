package com.shopapp.data

import com.shopapp.data.model.Category
import com.shopapp.data.model.Product

object DemoData {
    
    fun getCategories(): List<Category> {
        return listOf(
            Category(
                id = "1",
                name = "Điện thoại",
                imageUrl = "",
                productCount = 25
            ),
            Category(
                id = "2", 
                name = "Laptop",
                imageUrl = "",
                productCount = 15
            ),
            Category(
                id = "3",
                name = "Thời trang",
                imageUrl = "",
                productCount = 50
            ),
            Category(
                id = "4",
                name = "Gia dụng", 
                imageUrl = "",
                productCount = 30
            ),
            Category(
                id = "5",
                name = "Sách",
                imageUrl = "",
                productCount = 100
            ),
            Category(
                id = "6",
                name = "Đồ chơi",
                imageUrl = "",
                productCount = 40
            ),
            Category(
                id = "7",
                name = "Thể thao",
                imageUrl = "",
                productCount = 35
            ),
            Category(
                id = "8",
                name = "Làm đẹp",
                imageUrl = "",
                productCount = 60
            )
        )
    }
    
    fun getProducts(): List<Product> {
        return listOf(
            Product(
                id = "1",
                name = "iPhone 15 Pro Max 256GB",
                description = "Điện thoại thông minh cao cấp với chip A17 Pro, camera 48MP và màn hình Super Retina XDR 6.7 inch",
                price = 29990000.0,
                originalPrice = 32990000.0,
                imageUrls = listOf(""),
                category = "Điện thoại",
                stock = 10,
                rating = 4.8f,
                reviewCount = 150,
                isOnSale = true,
                discountPercentage = 9
            ),
            Product(
                id = "2",
                name = "MacBook Pro M3 14 inch",
                description = "Laptop chuyên nghiệp với chip M3, RAM 16GB, SSD 512GB, màn hình Liquid Retina XDR",
                price = 45990000.0,
                originalPrice = 45990000.0,
                imageUrls = listOf(""),
                category = "Laptop",
                stock = 5,
                rating = 4.9f,
                reviewCount = 89
            ),
            Product(
                id = "3",
                name = "Áo thun nam cotton cao cấp",
                description = "Áo thun nam 100% cotton, form regular fit, nhiều màu sắc, chất liệu thoáng mát",
                price = 299000.0,
                originalPrice = 399000.0,
                imageUrls = listOf(""),
                category = "Thời trang",
                stock = 20,
                rating = 4.5f,
                reviewCount = 45,
                isOnSale = true,
                discountPercentage = 25
            ),
            Product(
                id = "4",
                name = "Nồi cơm điện thông minh 1.8L",
                description = "Nồi cơm điện cao cấp với 8 chế độ nấu, lòng nồi chống dính, hẹn giờ thông minh",
                price = 1590000.0,
                originalPrice = 1590000.0,
                imageUrls = listOf(""),
                category = "Gia dụng",
                stock = 8,
                rating = 4.6f,
                reviewCount = 67
            ),
            Product(
                id = "5",
                name = "Sách: Đắc Nhân Tâm",
                description = "Cuốn sách kinh điển về nghệ thuật giao tiếp và ứng xử của Dale Carnegie",
                price = 89000.0,
                originalPrice = 120000.0,
                imageUrls = listOf(""),
                category = "Sách",
                stock = 50,
                rating = 4.7f,
                reviewCount = 234,
                isOnSale = true,
                discountPercentage = 26
            ),
            Product(
                id = "6",
                name = "Giày thể thao Nike Air Max",
                description = "Giày thể thao nam Nike Air Max với công nghệ đệm khí, thiết kế năng động",
                price = 2890000.0,
                originalPrice = 3200000.0,
                imageUrls = listOf(""),
                category = "Thể thao",
                stock = 12,
                rating = 4.4f,
                reviewCount = 78,
                isOnSale = true,
                discountPercentage = 10
            ),
            Product(
                id = "7",
                name = "Kem dưỡng da mặt Olay",
                description = "Kem dưỡng da chống lão hóa với Niacinamide và Peptide, phù hợp mọi loại da",
                price = 450000.0,
                originalPrice = 450000.0,
                imageUrls = listOf(""),
                category = "Làm đẹp",
                stock = 25,
                rating = 4.3f,
                reviewCount = 156
            ),
            Product(
                id = "8",
                name = "Đồ chơi LEGO Creator 3-in-1",
                description = "Bộ đồ chơi LEGO sáng tạo 3 trong 1, phát triển tư duy logic cho trẻ em",
                price = 1200000.0,
                originalPrice = 1400000.0,
                imageUrls = listOf(""),
                category = "Đồ chơi",
                stock = 15,
                rating = 4.8f,
                reviewCount = 92,
                isOnSale = true,
                discountPercentage = 14
            )
        )
    }
}
