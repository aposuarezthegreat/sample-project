package apo.suarez.personalproject.plugins

import app_versions
import org.gradle.api.Plugin
import org.gradle.api.Project
import apo.suarez.personalproject.addKotlinSourceSets
import apo.suarez.personalproject.androidApp
import apo.suarez.personalproject.androidExtensions
import apo.suarez.personalproject.kotlinOptions
import org.gradle.api.JavaVersion

class AndroidApplication: Plugin<Project> {

    override fun apply(project: Project) {

        project.plugins.apply("com.android.application")
        project.plugins.apply("kotlin-android")
        project.plugins.apply("kotlin-android-extensions")
        project.plugins.apply("kotlin-kapt")

        project.androidApp {
            compileSdkVersion(app_versions.compileSdk)

            defaultConfig {
                applicationId = app_versions.applicationId

                minSdkVersion(app_versions.minSdk)
                targetSdkVersion(app_versions.targetSdk)

                versionCode = app_versions.versionCode
                versionName = app_versions.versionName

                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

                multiDexEnabled = true

                ndk {
                    abiFilters("armeabi", "x86")
                }
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
                    proguardFiles(
                        getDefaultProguardFile("proguard-android.txt"),
                        "proguard-rules.pro"
                    )
                }
            }

            addKotlinSourceSets()
        }

        project.androidExtensions {
            isExperimental = true
        }
    }
}