package ph.cortex.cnxhome.plugins

import app_versions
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import apo.suarez.personalproject.addKotlinSourceSets
import apo.suarez.personalproject.android
import apo.suarez.personalproject.androidExtensions
import apo.suarez.personalproject.kotlinOptions

class AndroidLibrary : Plugin<Project> {

    override fun apply(project: Project) {
        project.plugins.apply("com.android.library")
        project.plugins.apply("kotlin-android")
        project.plugins.apply("kotlin-android-extensions")
        project.plugins.apply("kotlin-kapt")

        project.android {
            compileSdkVersion(app_versions.compileSdk)

            defaultConfig {
                minSdkVersion(app_versions.minSdk)
                targetSdkVersion(app_versions.targetSdk)

                versionCode = app_versions.versionCode
                versionName = app_versions.versionName

                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

                vectorDrawables.useSupportLibrary = true
            }

            compileOptions {
                targetCompatibility = JavaVersion.VERSION_1_8
                sourceCompatibility = JavaVersion.VERSION_1_8
            }

            kotlinOptions {
                jvmTarget = "1.8"
            }

            buildTypes {
                getByName("debug") {
                    isMinifyEnabled = false
                    isShrinkResources = false
                }
                getByName("release") {
                    isMinifyEnabled = true
                    consumerProguardFiles("proguard-rules.pro")
                }
            }

            addKotlinSourceSets()
        }

        project.androidExtensions {
            isExperimental = true
        }
    }
}