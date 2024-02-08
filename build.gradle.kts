@file:Suppress("UnstableApiUsage")

import kotlinx.benchmark.gradle.*
import org.jetbrains.kotlin.allopen.gradle.*
import org.jetbrains.kotlin.gradle.tasks.*


plugins {
    java
    kotlin("jvm") version "1.9.21"
    kotlin("plugin.allopen") version "1.9.21"
    id("org.jetbrains.kotlinx.benchmark") version "0.4.6"
}


    dependencies {
        implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime:0.4.6")
        implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime-jvm:0.4.6")

        //        implementation(sourceSets.main.get().output)
        //        implementation(sourceSets.main.get().runtimeClasspath)
    }


sourceSets.configureEach {
    java.setSrcDirs(listOf("$name/src"))
    resources.setSrcDirs(listOf("$name/resources"))
}

configure<AllOpenExtension> {
    annotation("org.openjdk.jmh.annotations.State")
}

repositories {
    mavenCentral()
}


tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
}


tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

benchmark {
    configurations {
        named("main") {
            iterationTime = 10
            iterationTimeUnit = "sec"

        }
    }
    targets {
        register("main") {
            this as JvmBenchmarkTarget
            jmhVersion = "1.21"
        }
    }
}

kotlin {
    jvmToolchain(21)
}
