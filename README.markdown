# Hello Scala World!

This is a very simple project skeleton for those who want to start experimenting with Scala programming quickly.

[SBT](http://www.scala-sbt.org/) and [Apache Maven](http://maven.apache.org/) support is provided out of the box:

If you open the pom.xml as a project in [Intellij Idea](http://www.jetbrains.com/idea/) and you have the Scala plugin installed, you get support from the ide for syntax highlighting, autocompletion, compiling, running, etc.

Alternatively, project files for [Intellij Idea](http://www.jetbrains.com/idea/) can be produced by SBT:

    $ sbt gen-idea

Now you can open the project in Idea via the open menu by choosing the root project directory. Idea will find the project files in the generated .idea dir and take it from there.

A very cool feature of SBT is [continuous build and test](http://www.scala-sbt.org/release/docs/Getting-Started/Running.html#continuous-build-and-test). Make sure to check it out!
