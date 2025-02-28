plugins {
    // For build.gradle.kts (Kotlin DSL)
    kotlin("jvm") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

val coroutineVersion = "1.10.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}