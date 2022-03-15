plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
    id("org.jetbrains.dokka")
}

group = "com.qingzhu"
version = "1.0.0-SNAPSHOT"

dependencies {
    implementation(project(":common"))

    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("org.springframework.data:spring-data-elasticsearch")
    implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")

    implementation("com.github.java-json-tools:json-schema-validator:2.2.14")
}
