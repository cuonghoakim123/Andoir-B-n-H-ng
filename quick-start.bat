@echo off
echo ========================================
echo    KHOI CHAY NHANH DU AN ANDROID
echo ========================================
echo.

REM Kiem tra emulator co dang chay khong
echo [1/5] Kiem tra emulator...
"%USERPROFILE%\AppData\Local\Android\Sdk\platform-tools\adb.exe" devices | findstr "emulator" >nul

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo ⚠️  Khong tim thay emulator dang chay!
    echo Dang khoi dong emulator...
    start "Android Emulator" "%USERPROFILE%\AppData\Local\Android\Sdk\emulator\emulator.exe" -avd Pixel_4
    
    echo Dang doi emulator khoi dong...
    timeout /t 30 /nobreak >nul
    
    REM Doi them cho emulator khoi dong hoan toan
    :wait_emulator
    "%USERPROFILE%\AppData\Local\Android\Sdk\platform-tools\adb.exe" devices | findstr "device" | findstr -v "offline" >nul
    if %ERRORLEVEL% NEQ 0 (
        echo Van dang doi emulator...
        timeout /t 10 /nobreak >nul
        goto wait_emulator
    )
)

echo ✅ Emulator da san sang!

REM Di chuyen vao thu muc du an
echo.
echo [2/5] Di chuyen vao thu muc du an...
cd /d "c:\laragon\www\apk andoir ban hang"

echo.
echo [3/5] Clean project...
call gradlew.bat clean

echo.
echo [4/5] Build va cai dat ung dung...
call gradlew.bat installDebug

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo ❌ LOI: Khong the build hoac cai dat ung dung!
    pause
    exit /b 1
)

echo.
echo [5/5] Khoi chay ung dung...
"%USERPROFILE%\AppData\Local\Android\Sdk\platform-tools\adb.exe" shell am start -n com.shopapp/.ui.MainActivity

echo.
echo 🎉 HOAN THANH! Ung dung da duoc khoi chay thanh cong!
echo.
echo Ban co the:
echo - Xem ung dung tren emulator
echo - Xem log bang lenh: adb logcat
echo - Chup man hinh bang lenh: adb shell screencap -p /sdcard/screenshot.png
echo.
pause
