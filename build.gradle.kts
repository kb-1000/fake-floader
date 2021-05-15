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
