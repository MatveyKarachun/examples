plugins {
    id("java")
}

group = "io.github.matveykarachun"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.projectreactor:reactor-core:3.5.4")

    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.projectreactor:reactor-test:3.5.4")
}

tasks.test {
    useJUnitPlatform()
}