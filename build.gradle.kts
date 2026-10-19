plugins {
    `java`
    // Replace the plugin id and version with the NeoForge/ForgeGradle plugin you use.
    // Example (placeholder):
    // id("net.neoforged.neoforge") version "PUT_NEOFORGE_PLUGIN_VERSION_HERE"
}

group = "com.isaacjones"
version = property("modVersion")

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(property("javaVersion").toString().toInt()))
    }
}

repositories {
    mavenCentral()
    // NeoForge/Forge repositories may be required. Add them after getting the MDK.
}

// NOTE: This is a minimal build file template. For a working Neoforge build for 1.21.1,
// download the NeoForge MDK for 1.21.1 and follow its instructions — then copy the plugin
// id/version and any specialized configuration into this file.

// Example placeholders for neoforge configuration (replace with MDK values):
// neoforge {
//     minecraft = "1.21.1"
//     loaderVersion = "<loader-range>"
// }

// dependencies {
//     minecraft("net.neoforged:neoforge:${property("neoforgeVersion")}")
// }

// Build and run tasks will be available once the right NeoForge/ForgeGradle plugin is applied.
