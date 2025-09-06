import org.lwjgl.Lwjgl.Preset
import org.lwjgl.Lwjgl.implementation
import org.lwjgl.Release
import org.lwjgl.lwjgl

plugins {
    id("java")
    id("org.lwjgl.plugin") version "0.0.35"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(("https://localhost:8081/nexus/content/groups/public"))
}

sourceSets {
    main {
        java {
            srcDirs("src/main/java", "src/main/generated")
        }
    }
}

dependencies {
    implementation("com.github.javaparser:javaparser-core:3.26.2")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("org.jetbrains:annotations:26.0.2-1")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    lwjgl {
        version = Release.latest
        implementation(Preset.everything)
    }
}

tasks.test {
    useJUnitPlatform()
}