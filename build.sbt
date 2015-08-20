import AssemblyKeys._

assemblySettings

mergeStrategy in assembly := {
  case "META-INF/MANIFEST.MF" => MergeStrategy.discard
  case "META-INF/ECLIPSEF.SF" => MergeStrategy.discard
  case "META-INF/ECLIPSEF.DSA" => MergeStrategy.discard
  case "META-INF/ECLIPSEF.RSA" => MergeStrategy.discard
  case "META-INF/*.SF" => MergeStrategy.discard
  case "META-INF/*.DSA" => MergeStrategy.discard
  case "META-INF/*.RSA" => MergeStrategy.discard
  case "reference.conf" => MergeStrategy.concat
  // case "reference.conf" => MergeStrategy.last
  case _ => MergeStrategy.first
  //case _ => MergeStrategy.first
}

//mergeStrategy in assembly := {
//  case "META-INF/MANIFEST.MF" => MergeStrategy.discard
//  case _ => MergeStrategy.first
//}

name := """cc-nsm2-core"""

version := "0.1"
// version := "1.0"

scalaVersion := "2.10.5"
// scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
// libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

libraryDependencies ++= {
  val sparkVersion = "1.4.1"
  // val sparkVersion = "1.3.0"
  Seq(
    "org.scalatest" %% "scalatest" % "2.2.4" % "test",
    "org.apache.spark"   %%  "spark-core"             % sparkVersion,
    "org.apache.spark"   %%  "spark-sql"              % sparkVersion
  )
}

