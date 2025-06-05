@echo off
echo ========================================
echo    Shop App - Setup and Run Script
echo ========================================
echo.

REM Check if Android SDK exists
set SDK_PATH=%LOCALAPPDATA%\Android\Sdk
if not exist "%SDK_PATH%" (
    set SDK_PATH=C:\Android\Sdk
)

if not exist "%SDK_PATH%" (
    echo ERROR: Android SDK not found!
    echo Please install Android Studio and SDK first.
    echo Common locations:
    echo - %LOCALAPPDATA%\Android\Sdk
    echo - C:\Android\Sdk
    pause
    exit /b 1
)

echo Found Android SDK at: %SDK_PATH%
set ANDROID_HOME=%SDK_PATH%
set PATH=%PATH%;%SDK_PATH%\platform-tools;%SDK_PATH%\tools

echo.
echo Setting up local.properties...
echo sdk.dir=%SDK_PATH:\=\\% > local.properties

echo.
echo Cleaning project...
call gradlew.bat clean

echo.
echo Building project...
call gradlew.bat assembleDebug

if %ERRORLEVEL% neq 0 (
    echo.
    echo BUILD FAILED!
    echo Please check Android Studio setup.
    pause
    exit /b 1
)

echo.
echo BUILD SUCCESSFUL!
echo.

echo Checking for running emulator...
adb devices | findstr emulator
if %ERRORLEVEL% neq 0 (
    echo.
    echo No emulator running. Please:
    echo 1. Open Android Studio
    echo 2. Tools → AVD Manager
    echo 3. Create and start an emulator
    echo 4. Then run this script again
    pause
    exit /b 1
)

echo.
echo Installing APK...
call gradlew.bat installDebug

if %ERRORLEVEL% neq 0 (
    echo.
    echo INSTALL FAILED!
    pause
    exit /b 1
)

echo.
echo Starting app...
adb shell am start -n com.shopapp/.ui.MainActivity

echo.
echo ========================================
echo    App launched successfully!
echo ========================================
echo.
echo The Shop App should now be running on your emulator.
echo You can now:
echo 1. Register a new account
echo 2. Browse products
echo 3. Add items to cart
echo 4. Explore all features
echo.
pause
