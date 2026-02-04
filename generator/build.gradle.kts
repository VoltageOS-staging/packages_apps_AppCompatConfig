import com.google.protobuf.gradle.*

plugins {
    kotlin("jvm") version "2.3.0"
    id("application")
    id("com.google.protobuf") version "0.9.5"
}

dependencies {
    implementation("com.google.protobuf:protobuf-kotlin:4.31.1")
    protobuf(files("proto"))
    implementation(kotlin("stdlib-jdk8"))
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:4.31.1"
    }
}

application {
    mainClass = "ConfigGeneratorKt"
}

kotlin {
    jvmToolchain(17)
}
