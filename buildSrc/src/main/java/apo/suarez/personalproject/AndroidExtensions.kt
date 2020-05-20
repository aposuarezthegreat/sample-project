package apo.suarez.personalproject

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import org.jetbrains.kotlin.gradle.internal.AndroidExtensionsExtension

val Project.android: BaseExtension
    get() = extensions.findByType(BaseExtension::class.java)
        ?: error("Project '$name' is not an Android module. Can't access 'android' extensions.")

fun Project.android(configure: BaseExtension.() -> Unit) {
    extensions.configure(BaseExtension::class.java, configure)
}

val Project.androidApp: BaseAppModuleExtension
    get() = extensions.findByType(BaseAppModuleExtension::class.java)
        ?: error("Android module is not an app module. Can't access 'android' app extension.")

fun Project.androidApp(configure: BaseAppModuleExtension.() -> Unit) {
    extensions.configure(BaseAppModuleExtension::class.java, configure)
}

val Project.androidExtensions: AndroidExtensionsExtension
    get() = extensions.findByType(AndroidExtensionsExtension::class.java)
        ?: error("Project '$name' does not have 'kotlin-android-extensions' plugin applied.")

fun Project.androidExtensions(configure: AndroidExtensionsExtension.() -> Unit) {
    extensions.configure(AndroidExtensionsExtension::class.java, configure)
}

val Project.kotlinOptions: KotlinJvmOptions
    get() = (this as ExtensionAware).extensions.findByType(KotlinJvmOptions::class.java)
        ?: error("'kotlinOptions' extension does not exist.")

fun BaseExtension.kotlinOptions(configure: KotlinJvmOptions.() -> Unit) {
    (this as ExtensionAware).extensions.configure(KotlinJvmOptions::class.java, configure)
}

fun BaseExtension.addKotlinSourceSets() {
    sourceSets {
        named("main") {
            java.srcDirs("src/main/java")
        }
    }
}