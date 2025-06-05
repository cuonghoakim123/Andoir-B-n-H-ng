# Shop App - Ứng dụng bán hàng Android

Ứng dụng bán hàng Android được phát triển bằng Kotlin với Firebase backend.

## Tính năng chính

- ✅ Đăng ký/Đăng nhập với Firebase Authentication
- ✅ Trang chủ với sản phẩm nổi bật và danh mục
- ✅ Danh sách danh mục sản phẩm
- ✅ Giỏ hàng với quản lý số lượng
- ✅ Hồ sơ người dùng
- ✅ Material Design UI/UX
- ✅ MVVM Architecture

## Công nghệ sử dụng

- **Kotlin** - Ngôn ngữ lập trình chính
- **Firebase Authentication** - Xác thực người dùng
- **Firebase Firestore** - Cơ sở dữ liệu NoSQL
- **Firebase Storage** - Lưu trữ hình ảnh
- **Material Design 3** - Thiết kế giao diện
- **Navigation Component** - Điều hướng
- **ViewBinding & DataBinding** - Binding dữ liệu
- **Glide** - Load hình ảnh
- **Retrofit** - API calls

## Cài đặt và chạy

### Yêu cầu hệ thống

- Android Studio Arctic Fox hoặc mới hơn
- Android SDK 24 trở lên
- JDK 8 trở lên

### Bước 1: Clone dự án

```bash
git clone <repository-url>
cd apk-andoir-ban-hang
```

### Bước 2: Cấu hình Firebase

1. Tạo project mới trên [Firebase Console](https://console.firebase.google.com/)
2. Thêm Android app với package name: `com.shopapp`
3. Tải file `google-services.json` và thay thế file hiện tại trong thư mục `app/`
4. Bật Authentication với Email/Password
5. Tạo Firestore Database
6. Cấu hình Storage

### Bước 3: Cấu hình Android SDK

1. Mở file `local.properties`
2. Cập nhật đường dẫn SDK:

```properties
sdk.dir=C\:\\Users\\cuong\\AppData\\Local\\Android\\Sdk
```

### Bước 4: Build và chạy

1. Mở project trong Android Studio
2. Sync project với Gradle files
3. Chạy ứng dụng trên emulator hoặc thiết bị thật

## Cấu trúc dự án

```
app/
├── src/main/
│   ├── java/com/shopapp/
│   │   ├── ui/
│   │   │   ├── auth/          # Đăng nhập/đăng ký
│   │   │   ├── home/          # Trang chủ
│   │   │   ├── categories/    # Danh mục
│   │   │   ├── cart/          # Giỏ hàng
│   │   │   └── profile/       # Hồ sơ
│   │   ├── data/
│   │   │   └── model/         # Data models
│   │   └── MainActivity.kt
│   ├── res/
│   │   ├── layout/           # XML layouts
│   │   ├── drawable/         # Icons, drawables
│   │   ├── values/           # Colors, strings, styles
│   │   └── navigation/       # Navigation graph
│   └── AndroidManifest.xml
```

## Tính năng sắp tới

- [ ] Chi tiết sản phẩm
- [ ] Tìm kiếm và lọc sản phẩm
- [ ] Thanh toán trực tuyến
- [ ] Quản lý đơn hàng
- [ ] Đánh giá sản phẩm
- [ ] Thông báo push
- [ ] Wishlist
- [ ] Chia sẻ sản phẩm

## Đóng góp

1. Fork dự án
2. Tạo feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to branch (`git push origin feature/AmazingFeature`)
5. Tạo Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Liên hệ

Email: cuonghotran17022004@gmail.com  
Phone Or Zalo : 0355999141
Project Link: [https://github.com/cuonghoakim/shopapp](https://github.com/cuonghoakim/shopapp)
