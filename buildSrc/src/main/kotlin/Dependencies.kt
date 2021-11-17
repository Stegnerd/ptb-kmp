object Versions {
    // TODO: DELETE THESE
    const val appCompat = "1.2.0"
    const val constraintLayout = "2.0.4"

    const val androidMinSdk = 30
    const val androidCompileSdk = 30
    const val androidTargetSdk = androidCompileSdk
    const val compose = "1.0.5"
    const val gradleVersionsPlugin = "0.39.0"
    const val junit = "4.13.2"
    const val kotlin = "1.5.31"
    const val material = "1.4.0"
}

object Dependencies {
    object Gradle {
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val gradleVersionsPlugin = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersionsPlugin}"
    }

    object Android {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object AndroidX {
        // TODO: DELETE
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constrainLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object Compose {

    }

    object Test {
        const val junit = "junit:junit:${Versions.junit}"
        const val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        const val kotlinTestAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        const val kotlinTestJUnit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
        const val kotlinTestJUnit5 = "org.jetbrains.kotlin:kotlin-test-junit5:${Versions.kotlin}"
    }
}