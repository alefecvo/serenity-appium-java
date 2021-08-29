# Serenity Appium Test Project with Java

This project is used to automation test using Serenity and Appium with Java.

## Dependencies

#### Install the items

1. IntelliJ (last version).
2. Android Studio (last version).
3. Java Development Kit 8 or 11 (This project used JDK 11 - version 11.0.10).
4. Appium 1.20.0 (Start Server 1.20.0).
5. Configure the environments variable JAVA_HOME, ANDROID_HOME and PATH
6. Create Android and iOS simulators or devices
7. Install Appium Doctor

---
#### Install SDK (software development kit)

1. Open Android Studio.
2. Click in 'Configure -> SDK Manager'.
3. On tab 'SDK Platforms' choose the "OS Android" and click in "Apply".
4. On tab 'SDK Tools' choose the "Android SDK Build-Tools", "Android Emulator", "Android SDK Platform-Tools","Android SDK Tools", "Intel x86 Emulator Accelerator (HAXM installer)" and click in "Apply".

---

#### Create/edit environments variable:

#### MAC

- **JAVA HOME**
    - Configure the environments variables (Open .bash_profile)
        - Add or Edit
            - export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.10.jdk/Contents/Home
- **ANDROID HOME**
    - Configure the environments variables (Open .bash_profile)
        - Add or Edit
            - export ANDROID_HOME=/Users/YOUR_USER/Library/Android/sdk
            - export PATH=$PATH:$ANDROID_HOME/tools
            - export PATH=$PATH:$ANDROID_HOME/tools/bin
            - export PATH=$PATH/:$ANDROID_HOME/platform-tools

---
#### WINDOWS

- **JAVA HOME**
    - Configure the environments variables (Control panel -> System -> Advanced configuration> Environment variables -> SYSTEM VARIABLES)
    - New
        - JAVA_HOME
        - C:\Program Files\Java\jdk-11.0.10
    - Edit "PATH" adding:
        - %JAVA_HOME%\bin;
    - Execute command "java -version" no CMD


- **ANDROID HOME**
    - Configure the environments variables (Control panel -> System -> Advanced configuration> Environment variables -> SYSTEM VARIABLES)
    - New
        - ANDROID_HOME
            - C:\Ferramentas
    - Edit "PATH" adding:
        - %ANDROID_HOME%\tools;
        - %ANDROID_HOME%\tools\bin;
        - %ANDROID_HOME%\platform-tools;
    - Verify the environments variables:
        - Open 'CMD' and execute the commands:
            - adb
            - emulator
            - uiautomatorviewer
            - cd %ANDROID_HOME%
                - emulator -list-avds

---
#### Create Emulator (Android) on Android Studio

1. Open Android Studio.
2. Click in 'Configure -> AVD Manager'.
3. Click in 'Create Virtual Device'.
4. Choose the "Phone" and click in "Next".
5. Choose the "AVD Name" and click in "Finish".
6. Open terminal.
7. Execute command.
8. The device name is returned (example: Nexus_5X_API_27).
```bash
emulator -list-avds
```

---

#### Open the emulator
1. Open terminal.
2. Execute command
```bash
cd $ANDROID_HOME/tools
emulator @Nexus_5X_API_27
```

---

#### Open the search elements
1. Open terminal.
2. Execute command
```bash
cd $ANDROID_HOME/tools
uiautomatorviewer
```

---

#### Create Simulator (iOS) on XCode

1. Open XCode.
2. Click in 'Simulator'.
3. Choose the "Phone" and click in "Next".

---

#### To open locator in Appium.
1. Open Appium.
2. Click in 'Start Server'.
3. Click in Search.
4. Click in tab 'Automatic Server'.
5. Click in tab 'Desired Capabilities'.
6. Add the variables.
7. Click in 'Start Server'.

```bash
{
  "app": "/Users/YOUR_USER/apps/flipboard.apk",
  "platformName": "android",
  "platformVersion": "11",
  "deviceName": "android-emulator"
}
or
{
  "platformName": "Android",
  "deviceName": "android-emulator",
  "automationName": "uiautomator2",
  "appPackage": "flipboard.app",
  "appActivity": "flipboard.activities.LaunchActivityAlias"
}
```

```bash
{
  "app": "/Users/YOUR_USER/apps/flipboard.app",
  "platformName": "iOS",
  "platformVersion": "14.4",
  "deviceName": "iPhone 11"
}
```



---

## Run Tests:

#### To download, get clone this project to your computer and execute the commands bellow:

1. Open project with IntelliJ.
2. Run test with JUnit or execute commands on IntelliJ terminal with Maven.

```bash
mvn clean
mvn instal
mvn clean verify
```
3. Access on project 'target/site/index.html' and open Chrome browser to see results dasboards.


---

## IMPORTANT

* Before run the tests you need to start devices android/iOS and start appium server.