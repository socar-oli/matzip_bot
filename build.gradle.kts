import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val GRPC_VERSION: String = "3.19.4"
val PROTOBUF_KOTLIN_VERSION: String = "3.21.8"
val PROTOBUF_JAVA_UTIL_VERSION: String = "3.21.5"

buildscript {
	repositories {
		gradlePluginPortal()
		mavenCentral()
	}
	dependencies {
		classpath("com.google.protobuf:protobuf-gradle-plugin:0.9.1")
		classpath("com.google.gradle:osdetector-gradle-plugin:1.7.1")
	}
}

plugins {
	id("org.springframework.boot") version "2.7.5"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	id("com.google.protobuf") version "0.9.1"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	implementation("com.google.protobuf:protobuf-java-util:$PROTOBUF_JAVA_UTIL_VERSION")
	implementation("com.google.protobuf:protobuf-kotlin:$PROTOBUF_KOTLIN_VERSION")

	testImplementation("io.mockk:mockk:1.12.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

protobuf {
	protoc {
		artifact = "com.google.protobuf:protoc:$GRPC_VERSION"
	}

	generatedFilesBaseDir = "$projectDir/src/generated"
}


