# Grip Strength Mod (NeoForge / Minecraft 1.21.1)

This repository is a starter skeleton for a NeoForge-style Minecraft mod targeted at Minecraft 1.21.1.

What I created:
- Gradle project files (template): settings.gradle.kts, build.gradle.kts, gradle.properties
- Example mod class: src/main/java/com/isaacjones/gripstrength/GripStrengthMod.java
- Example mods.toml: src/main/resources/META-INF/mods.toml
- .gitignore
- GitHub Actions workflow to build with Gradle and upload the artifact

Notes & next steps you should do locally:
1. Download the NeoForge MDK for Minecraft 1.21.1 from the official NeoForge releases page: https://github.com/NeoForged/NeoForge/releases (pick the MDK/zip for 1.21.1).
2. Follow the MDK README to copy the correct plugin id/version and any required repository entries into build.gradle.kts and gradle.properties. Replace the placeholder neoforgeVersion with the MDK's plugin/version.
3. Make sure the Mod annotation import in GripStrengthMod.java matches the loader's package (the example uses net.neoforged.fml.common.Mod as a placeholder).
4. Run the Gradle wrapper tasks added by the MDK:
   - ./gradlew runClient
   - ./gradlew build

If you'd like, I can update build.gradle.kts to include the exact NeoForge plugin coordinates if you tell me the MDK version you want to use (or I can look it up and apply it).
