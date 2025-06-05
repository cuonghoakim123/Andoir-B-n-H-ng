@echo off
echo ========================================
echo    Opening Shop App in Android Studio
echo ========================================
echo.

REM Common Android Studio installation paths
set STUDIO_PATH1="C:\Program Files\Android\Android Studio\bin\studio64.exe"
set STUDIO_PATH2="C:\Users\%USERNAME%\AppData\Local\JetBrains\Toolbox\apps\AndroidStudio\ch-0\*\bin\studio64.exe"
set STUDIO_PATH3="C:\Program Files (x86)\Android\Android Studio\bin\studio64.exe"

if exist %STUDIO_PATH1% (
    echo Found Android Studio at: %STUDIO_PATH1%
    start "" %STUDIO_PATH1% "%CD%"
    goto :end
)

if exist %STUDIO_PATH2% (
    echo Found Android Studio at: %STUDIO_PATH2%
    start "" %STUDIO_PATH2% "%CD%"
    goto :end
)

if exist %STUDIO_PATH3% (
    echo Found Android Studio at: %STUDIO_PATH3%
    start "" %STUDIO_PATH3% "%CD%"
    goto :end
)

echo Android Studio not found in common locations.
echo Please manually open Android Studio and import this project.
echo Project location: %CD%
pause

:end
echo Android Studio should be opening...
timeout /t 3
