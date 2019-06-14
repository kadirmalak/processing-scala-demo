name := "processing-scala-demo"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "org.processing" % "core" % "3.3.7",
  "org.processing" % "pdf" % "3.3.7",
  "com.lowagie" % "itext" % "2.1.7",
  "org.jogamp.gluegen" % "gluegen-rt-main" % "2.3.2",
  "org.jogamp.jogl" % "jogl-all-main" % "2.3.2"
)
