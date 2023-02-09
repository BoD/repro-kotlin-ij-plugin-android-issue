buildscript {
  repositories {
    mavenCentral()
    google()
  }

  dependencies {
    classpath("com.android.tools.build:gradle:7.3.0")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
  }
}

include(":app")
