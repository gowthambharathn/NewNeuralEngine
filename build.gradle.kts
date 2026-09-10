plugins {
    base
    `maven-publish`
}

group = "com.github.gowthambharathn"
version = "1.0.1"

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.gowthambharathn"
            artifactId = "NewNeuralEngine"
            version = "1.0.1"

            artifact(file("production-release.aar"))

            pom {
                name.set("Orbit")
                description.set(
                    "Reusable Android UI components and utilities"
                )

                url.set(
                    "https://github.com/gowthambharathn/NewNeuralEngine"
                )
            }
        }
    }
}
