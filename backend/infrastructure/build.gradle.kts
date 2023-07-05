plugins {
    java
}

dependencies {
    implementation(project(":backend:domain"))

    implementation(libs.spring.boot.starter)
    implementation(libs.bundles.sqlserver)
}
