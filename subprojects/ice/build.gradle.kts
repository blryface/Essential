/*
 * Copyright (c) 2024 ModCore Inc. All rights reserved.
 *
 * This code is part of ModCore Inc.'s Essential Mod repository and is protected
 * under copyright registration # TX0009138511. For the full license, see:
 * https://github.com/EssentialGG/Essential/blob/main/LICENSE
 *
 * You may not use, copy, reproduce, modify, sell, license, distribute,
 * commercialize, or otherwise exploit, or create derivative works based
 * upon, this file or any other in this repository, all of which is reserved by Essential.
 */
import gg.essential.gradle.util.KotlinVersion

plugins {
    kotlin("jvm")
    id("java-library")
}

kotlin.jvmToolchain(8)

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.slf4j.api)
    implementation(kotlin("stdlib-jdk8", KotlinVersion.minimal.stdlib))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${KotlinVersion.minimal.coroutines}")
    implementation(project(":utils"))
}
