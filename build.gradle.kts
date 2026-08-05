plugins {
    kotlin("jvm") version "1.8.0"
    id("io.ktor.plugin") version "2.3.0"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.0"
}

group = "com.fintech"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("com.fintech.loan.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.0")
    implementation("io.ktor:ktor-server-netty:2.3.0")
    implementation("io.github.resilience4j:resilience4j-kotlin:1.7.0")
    implementation("io.ktor:ktor-client-core:2.3.0")
    implementation("io.ktor:ktor-client-cio:2.3.0")
    testImplementation("io.ktor:ktor-server-tests:2.3.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.8.0")
}