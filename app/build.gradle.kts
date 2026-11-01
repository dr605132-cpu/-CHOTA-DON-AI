
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.chotadon.ai"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.chotadon.ai"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}
