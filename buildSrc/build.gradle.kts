repositories {
    google()
    jcenter()
}

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

gradlePlugin {
    // Generate plugins that can be used inside `plugins` block
    plugins {
        create("AndroidApplication") {
            id = "base-android-application"
            implementationClass = "apo.suarez.personalproject.plugins.AndroidApplication"
        }
        create("AndroidLibrary") {
            id = "base-android-library"
            implementationClass = "apo.suarez.personalproject.plugins.AndroidLibrary"
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.61")
    implementation("com.android.tools.build:gradle:3.5.3")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
}