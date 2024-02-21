buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.1")
        classpath("io.github.gradle-nexus:publish-plugin:1.3.0")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
    id ("io.github.gradle-nexus.publish-plugin") version "1.3.0" apply false
}

/*apply plugin: 'io.github.gradle-nexus.publish-plugin'
apply from: "${rootDir}/scripts/publish-auth.gradle"*/