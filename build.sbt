organization := "com.github.arrow-genomics"
organizationName := "Arrow-Genomics "

startYear := Some(2018)

developers += Developer(id = "ffinfo",
                        name = "Peter van 't Hof",
                        email = "pjrvanthof@gmail.com",
                        url = url("https://github.com/ffinfo"))

scalaVersion := "2.11.12"

libraryDependencies += "org.apache.arrow" % "arrow-vector" % "0.9.0"
libraryDependencies += "org.apache.arrow" % "arrow-memory" % "0.9.0"
libraryDependencies += "org.apache.arrow" % "arrow-format" % "0.9.0"
