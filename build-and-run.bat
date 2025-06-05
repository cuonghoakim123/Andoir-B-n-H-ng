@echo off
echo ========================================
echo    Shop App - Build and Run Script
echo ========================================
echo.

echo Checking for Android SDK...
if not exist "%ANDROID_HOME%" (
    echo ERROR: ANDROID_HOME not set!
    echo Please set ANDROID_HOME environment variable to your Android SDK path
    echo Example: C:\Users\%USERNAME%\AppData\Local\Android\Sdk
    pause
    exit /b 1
)

echo Android SDK found at: %ANDROID_HOME%
echo.

echo Cleaning project...
call gradlew.bat clean

echo.
echo Building project...
call gradlew.bat assembleDebug

if %ERRORLEVEL% neq 0 (
    echo.
    echo BUILD FAILED!
    echo Please check the error messages above.
    pause
    exit /b 1
)

echo.
echo BUILD SUCCESSFUL!
echo.

echo Checking for connected devices...
adb devices

echo.
echo Installing APK...
call gradlew.bat installDebug

if %ERRORLEVEL% neq 0 (
    echo.
    echo INSTALL FAILED!
    echo Make sure you have a device connected or emulator running.
    pause
    exit /b 1
)

echo.
echo INSTALL SUCCESSFUL!
echo Starting app...
adb shell am start -n com.shopapp/.ui.MainActivity

echo.
echo App should now be running on your device!
pause
