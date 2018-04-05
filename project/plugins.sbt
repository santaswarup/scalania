
libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value

resolvers += Classpaths.typesafeReleases

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"
//addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

//scala sstyle plugin
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

//scapegoat plugin
addSbtPlugin("com.sksamuel.scapegoat" %% "sbt-scapegoat" % "1.0.4")

//Wart remover Plugin
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.2.1")


//scoverage plugin
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")

//codacy-coverage plugin
addSbtPlugin("com.codacy" % "sbt-codacy-coverage" % "1.3.12")


//cpd plugin
addSbtPlugin("com.github.sbt" % "sbt-cpd" % "2.0.0")

//findbugs plugin
addSbtPlugin("com.github.sbt" % "sbt-findbugs" % "2.0.0")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.5.9")

addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.14")
