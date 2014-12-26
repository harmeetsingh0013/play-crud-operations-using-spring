name := "play-crud"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.4"

resolvers += "Maven Repo" at "http://mvnrepository.com/artifact/javax.inject/javax.inject"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.springframework" % "spring-context" % "4.1.3.RELEASE",
  "javax.inject" % "javax.inject" % "1"
)     

play.Project.playJavaSettings
