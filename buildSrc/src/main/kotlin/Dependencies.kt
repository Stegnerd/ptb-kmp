object Versions {
    // TODO: DELETE THESE
    const val appCompat = "1.2.0"
    const val constraintLayout = "2.0.4"

    const val androidMinSdk = 30
    const val androidCompileSdk = 31
    const val androidTargetSdk = androidCompileSdk
    const val activityCompose = "1.3.0-alpha06"
    const val coreKtx = "1.7.0"
    const val compose = "1.0.5"
    const val gradleVersionsPlugin = "0.39.0"
    const val junit = "4.13.2"
    const val kotlin = "1.5.31"
    const val lifecycleKtx = "2.4.0"
    const val material = "1.4.0"
}

object Dependencies {
    object Gradle {
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val gradleVersionsPlugin =
            "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersionsPlugin}"
    }

    object Android {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object AndroidX {
        const val constrainLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

        // TODO: DELETE
        const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtx}"
    }

    object Compose {
        const val material = "androidx.compose.material:material:${Versions.compose}"
        const val tooling = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.junit}"
        const val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        const val kotlinTestAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        const val kotlinTestJUnit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
        const val kotlinTestJUnit5 = "org.jetbrains.kotlin:kotlin-test-junit5:${Versions.kotlin}"
    }
}