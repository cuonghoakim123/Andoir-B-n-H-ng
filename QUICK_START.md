# 🚀 Hướng dẫn khởi chạy nhanh Shop App

## ✅ Dự án đã được tạo thành công!

### 📁 Cấu trúc dự án hiện tại:
```
📦 apk andoir bán hàng/
├── 📁 app/                    # Mã nguồn ứng dụng
├── 📁 gradle/                 # Gradle wrapper
├── 📄 build.gradle           # Build script chính
├── 📄 settings.gradle        # Cấu hình project
├── 📄 README.md              # Tài liệu chi tiết
├── 📄 QUICK_START.md         # Hướng dẫn này
├── 🔧 build-and-run.bat      # Script build và chạy
└── 🔧 open-android-studio.bat # Script mở Android Studio
```

## 🎯 Cách khởi chạy ứng dụng

### Phương pháp 1: Sử dụng Android Studio (Khuyến nghị)
1. **Mở Android Studio:**
   ```bash
   # Chạy script tự động
   open-android-studio.bat
   
   # Hoặc mở thủ công Android Studio và import project này
   ```

2. **Sync project:**
   - Android Studio sẽ tự động sync Gradle
   - Chờ quá trình hoàn tất

3. **Chạy ứng dụng:**
   - Nhấn nút ▶️ Run
   - Hoặc Shift + F10

### Phương pháp 2: Sử dụng Command Line
```bash
# Build và cài đặt ứng dụng
build-and-run.bat
```

## 📱 Tính năng đã hoàn thành

### ✅ Đăng nhập/Đăng ký
- Firebase Authentication
- Giao diện đăng nhập/đăng ký đẹp mắt
- Validation form

### ✅ Trang chủ
- Banner khuyến mãi
- Danh mục sản phẩm (horizontal scroll)
- Sản phẩm nổi bật (grid layout)
- Thanh tìm kiếm

### ✅ Danh mục sản phẩm
- Grid layout 2 cột
- 8 danh mục mẫu
- Hiển thị số lượng sản phẩm

### ✅ Giỏ hàng
- Thêm/xóa sản phẩm
- Tăng/giảm số lượng
- Tính tổng tiền tự động
- Empty state

### ✅ Hồ sơ người dùng
- Thông tin cá nhân
- Menu chức năng
- Đăng xuất

## 🎨 Demo Data

Ứng dụng đã có sẵn dữ liệu mẫu:
- **8 danh mục:** Điện thoại, Laptop, Thời trang, Gia dụng, Sách, Đồ chơi, Thể thao, Làm đẹp
- **8 sản phẩm:** iPhone, MacBook, Áo thun, Nồi cơm điện, Sách, Giày thể thao, Kem dưỡng da, LEGO

## 🔧 Cấu hình Firebase (Tùy chọn)

Để sử dụng Firebase thật:
1. Tạo project trên [Firebase Console](https://console.firebase.google.com/)
2. Thêm Android app với package: `com.shopapp`
3. Tải `google-services.json` và thay thế file trong `app/`
4. Bật Authentication với Email/Password
5. Tạo Firestore Database

## 🎯 Chạy thử ngay

1. **Mở Android Studio:**
   ```bash
   open-android-studio.bat
   ```

2. **Hoặc build trực tiếp:**
   ```bash
   build-and-run.bat
   ```

3. **Đăng ký tài khoản mới** trong ứng dụng
4. **Khám phá các tính năng** đã được tạo

## 📞 Hỗ trợ

Nếu gặp vấn đề:
1. Kiểm tra Android SDK đã cài đặt
2. Đảm bảo có thiết bị/emulator đang chạy
3. Xem log trong Android Studio

---

**🎉 Chúc bạn khám phá ứng dụng vui vẻ!**
