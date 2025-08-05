plugins {
    // Make plugins available to the entire project
    // The 'alias(...)' syntax means you are using a version catalog (libs.versions.toml)
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.kotlin.kapt) apply false
    alias(libs.plugins.hilt.android) apply false
}
