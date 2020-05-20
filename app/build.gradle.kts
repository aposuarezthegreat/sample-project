import dependencies.deps

plugins{
    id("base-android-application")
}

dependencies {
    //implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation(project(Modules.navigation))
    implementation(project(Modules.splashscreen))

    implementation(deps.android.multidex)

    implementation(deps.kotlin.stdLib)

    implementation(deps.androidx.appcompat)
    implementation(deps.androidx.core)
    implementation(deps.androidx.material_design)
    implementation(deps.androidx.constraint_layout)

    implementation(deps.androidx.lifecycle_extensions)

    implementation(deps.androidx.navigation.navigation_fragment_ktx)
    implementation(deps.androidx.navigation.navigation_ui_ktx)

    implementation(deps.koin.core)
    implementation(deps.koin.androidx.viewmodel)

    testImplementation(deps.testing.junit)
    androidTestImplementation(deps.androidx.testing.junit_ext)
    androidTestImplementation(deps.androidx.testing.espresso)
}
