ThisBuild / scalaVersion := "2.12.8"

lazy val tests = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .enablePlugins(DockerPlugin)
  .settings(
    name := "Tests",
    libraryDependencies += "org.scalawebtest" %% "scalawebtest-core" % "3.0.0",
    libraryDependencies += "org.scalawebtest" %% "scalawebtest-json" % "3.0.0",
    libraryDependencies += "org.scalawebtest" %% "scalawebtest-aem" % "3.0.0",
    libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.26",
  )

unmanagedSourceDirectories in Compile += baseDirectory.value / "src/test/scala"

mainClass in Compile := Some("org.scalatest.tools.Runner")
