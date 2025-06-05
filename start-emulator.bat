@echo off
echo ========================================
echo       KHOI DONG ANDROID EMULATOR
echo ========================================
echo.

echo Dang kiem tra cac emulator co san...
"%USERPROFILE%\AppData\Local\Android\Sdk\emulator\emulator.exe" -list-avds

echo.
echo Dang khoi dong emulator Pixel_4...
echo Vui long doi 1-2 phut de emulator khoi dong hoan toan.
echo.

start "Android Emulator" "%USERPROFILE%\AppData\Local\Android\Sdk\emulator\emulator.exe" -avd Pixel_4

echo ✅ Emulator dang khoi dong...
echo Sau khi emulator khoi dong xong, ban co the chay file run-app.bat
echo.
pause
