ThisBuild / scalaVersion := "2.13.6"

lazy val `rename-issue` = project.in(file(".")).aggregate(a, b)

lazy val a = project.in(file("a"))
lazy val b = project.in(file("b"))
