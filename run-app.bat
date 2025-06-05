@echo off
echo ========================================
echo    KHOI CHAY UNG DUNG ANDROID E-COMMERCE
echo ========================================
echo.

REM Di chuyen vao thu muc du an
cd /d "c:\laragon\www\apk andoir ban hang"

echo [1/4] Kiem tra emulator...
"%USERPROFILE%\AppData\Local\Android\Sdk\platform-tools\adb.exe" devices

echo.
echo [2/4] Build va cai dat ung dung...
call gradlew.bat installDebug

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo ❌ LOI: Khong the build hoac cai dat ung dung!
    echo Vui long kiem tra lai emulator va thu lai.
    pause
    exit /b 1
)

echo.
echo [3/4] Khoi chay ung dung...
"%USERPROFILE%\AppData\Local\Android\Sdk\platform-tools\adb.exe" shell am start -n com.shopapp/.ui.MainActivity

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo ❌ LOI: Khong the khoi chay ung dung!
    pause
    exit /b 1
)

echo.
echo ✅ THANH CONG: Ung dung da duoc khoi chay!
echo.
echo Cac lenh huu ich:
echo - Xem log: adb logcat
echo - Chup man hinh: adb shell screencap -p /sdcard/screenshot.png
echo - Tai screenshot: adb pull /sdcard/screenshot.png screenshot.png
echo.
pause
