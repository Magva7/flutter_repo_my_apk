plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.myapp" // Замените на свой пакет
    compileSdk = flutter.compileSdkVersion

    defaultConfig {
        applicationId = "com.example.myapp" // Замените на свой пакет
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode(flutter.versionCode)
        versionName(flutter.versionName)
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

flutter {
    source = "../.."
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${extra["kotlin_version"]}")
}
