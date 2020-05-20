import dependencies.deps

plugins {
    id("base-android-library")
}

dependencies {
    implementation(project(Modules.navigation))

    implementation(deps.kotlin.stdLib)

    implementation(deps.androidx.appcompat)
    implementation(deps.androidx.constraint_layout)
    implementation(deps.androidx.material_design)

    implementation(deps.androidx.core)

    implementation(deps.koin.androidx.viewmodel)

    implementation(deps.kotlin.coroutines.runtime)
}
