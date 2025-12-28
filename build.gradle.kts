plugins {
    java
    id("org.springframework.boot") version "4.0.1"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "id.my.hendisantika"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-testcontainers")
    runtimeOnly("org.postgresql:postgresql")
    implementation("net.javacrumbs.shedlock:shedlock-spring:7.5.0")
    implementation("net.javacrumbs.shedlock:shedlock-provider-jdbc-template:7.5.0")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    developmentOnly("org.springframework.boot:spring-boot-docker-compose")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("org.testcontainers:testcontainers:2.0.3")
    testImplementation("org.testcontainers:postgresql:2.0.3")
    testImplementation("org.testcontainers:junit-jupiter:2.0.3")

}

tasks.withType<Test> {
    useJUnitPlatform()
}
