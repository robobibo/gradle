pluginManagement {
    includeBuild("build-logic/build-logic-base")
}

plugins {
    id("gradlebuild.settings-plugins")
    id("gradlebuild.repositories")
}

rootProject.name = "gradle"

includeBuild("distribution-core")
includeBuild("distribution-plugins/essentials")
includeBuild("distribution-plugins/basics")
includeBuild("distribution-plugins/jvm")
includeBuild("distribution-plugins/native")
includeBuild("distribution-plugins/publishing")
includeBuild("distribution-plugins/full")

includeBuild("testing/fixtures")
includeBuild("testing/end-to-end-tests")
includeBuild("testing/reports")

includeBuild("documentation")
