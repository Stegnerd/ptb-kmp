import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
}

version = "1.0"

kotlin {
    android()

    val iosTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget = when {
        System.getenv("SDK_NAME")?.startsWith("iphoneos") == true -> ::iosArm64
        System.getenv("NATIVE_ARCH")?.startsWith("arm") == true -> ::iosSimulatorArm64
        else -> ::iosX64
    }

    iosTarget("ios") {}

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        frameworkName = "shared"
        podfile = project.file("../iosApp/Podfile")
    }
    
    sourceSets {
        val commonMain by getting
        sourceSets["commonMain"].dependencies {

        }

        sourceSets["commonTest"].dependencies {
            with(Dependencies.Test) {
                implementation(kotlinTest)
                implementation(kotlinTestAnnotations)
            }
        }

        sourceSets["androidMain"].dependencies {

        }
        sourceSets["androidTest"].dependencies {
            implementation(Dependencies.Test.junit)
            implementation(Dependencies.Test.kotlinTestJUnit)
        }

        sourceSets["iosMain"].dependencies {  }
        sourceSets["iosTest"].dependencies {  }
    }
}

android {
    compileSdkVersion(30)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(30)
        targetSdkVersion(30)
    }
}