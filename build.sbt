name := "play-crud"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.springframework" % "spring-context" % "4.1.3.RELEASE",
  "javax.inject" % "javax.inject" % "1" 
)     

play.Project.playJavaSettings
