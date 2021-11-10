object Versions {
    const val androidMinSdk = 30
    const val androidCompileSdk = 30
    const val androidTargetSdk = androidCompileSdk

    const val kotlin = "1.5.31"

    const val gradleVersionsPlugin = "0.39.0"
}

object Dependencies {
    object Gradle {
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val gradleVersionsPlugin = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersionsPlugin}"
    }
}