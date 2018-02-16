
plugins { kotlin("jvm") }

dependencies {
    compile(project(":compiler:util"))
    compile(project(":js:js.ast"))
    compileOnly(intellijCoreDep()) { includeJars("intellij-core") }
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

