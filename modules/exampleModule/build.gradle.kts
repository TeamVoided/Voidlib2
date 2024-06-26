plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    id("iridium.mod.build-script")
    id("iridium.project.publish-script")
}

modSettings {
    modId("example-module")
    modName("VoidLib2: Example Module")
}

publishScript {
    releaseRepository("TeamVoided", "https://maven.teamvoided.org/releases")
    publication(modSettings.modId(), isSnapshot = false)
    publication(modSettings.modId(), isSnapshot = true)
}

base.archivesName = "voidlib2-example-module"
version = properties["version"] as String
group = properties["maven_group"] as String
