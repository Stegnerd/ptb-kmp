plugins {
    id("com.android.application")
    kotlin("android")
}


android {
    compileSdk = Versions.androidCompileSdk

    defaultConfig {
        applicationId = "com.stegnerd.ptbkmp"
        minSdk = Versions.androidMinSdk
        targetSdk = Versions.androidTargetSdk

        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(Dependencies.Android.material)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.constrainLayout)
}
