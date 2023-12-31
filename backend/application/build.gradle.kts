plugins {
    java
}

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    implementation(project(":backend:domain"))
    implementation(project(":backend:infrastructure"))

    implementation(libs.spring.boot.starter.web)
}
