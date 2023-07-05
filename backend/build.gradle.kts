plugins {
    java
    application
}

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    implementation(libs.spring.boot.starter.web)
    implementation(libs.bundles.sqlserver)
}
