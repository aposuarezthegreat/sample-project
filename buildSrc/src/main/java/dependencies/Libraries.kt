package dependencies

import versions

object deps {

    object maven {
        const val jitpack = "https://jitpack.io"
    }

    object kotlin {
        const val gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${versions.kotlin}"
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${versions.kotlin}"

        object coroutines {
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${versions.coroutines}"
            const val runtime = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${versions.coroutines}"
        }
    }

    object android {
        const val agp = "com.android.tools.build:gradle:${versions.agp}"
        const val multidex = "com.android.support:multidex:${versions.multidex}"
    }
    
    object androidx {
        const val appcompat = "androidx.appcompat:appcompat:${versions.appcompat}"
        const val core = "androidx.core:core-ktx:${versions.core}"
        const val material_design = "com.google.android.material:material:${versions.material_design}"
        const val constraint_layout = "androidx.constraintlayout:constraintlayout:${versions.constraint_layout}"
        const val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${versions.lifecycle_extension}"
        
        object navigation{
            const val navigation_fragment_ktx =  "androidx.navigation:navigation-fragment-ktx:${versions.navigation}"
            const val navigation_ui_ktx = "androidx.navigation:navigation-ui-ktx:${versions.navigation}"
        }
        
        object testing {
            const val junit_ext = "androidx.test.ext:junit:${versions.junit_ext}"
            const val espresso = "androidx.test.espresso:espresso-core:${versions.espresso}"
        }
    }

    object koin {
        const val core = "org.koin:koin-core:${versions.koin}"
        const val android = "org.koin:koin-android:${versions.koin}"
        const val test = "org.koin:koin-test:${versions.koin}"

        object androidx {
            const val viewmodel = "org.koin:koin-androidx-viewmodel:${versions.koin}"
            const val fragment_ext = "org.koin:koin-androidx-fragment:${versions.koin}"
        }
    }
    
    object testing {
        const val junit = "junit:junit:${versions.junit}"
    }
}