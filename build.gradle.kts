plugins {
    java
}

group = "de.kb1000"
version = "1.0"

repositories {
    mavenCentral()
    maven(url = "https://maven.quiltmc.org/repository/release/") {
        name = "QuiltMC"
    }
}

dependencies {
    implementation("org.quiltmc:quilt-loader:0.13.1-rc.3")
    implementation("org.apache.logging.log4j:log4j-api:2.8.1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withSourcesJar()
}

tasks.processResources {
    filesMatching("fabric.mod.json") {
        expand(
            mutableMapOf(
                "version" to project.version
            )
        )
    }
}

tasks.jar {
    from(project.file("LICENSE"))
}

tasks.getByName<Jar>("sourcesJar") {
    from(project.file("LICENSE"))
}

// vim: et ts=4 sw=4
