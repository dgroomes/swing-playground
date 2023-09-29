# swing-playground

📚 Learning and exploring Swing, the GUI widget toolkit for Java.


## Overview

It's 2023 and we're learning Swing? It's hard to believe, but while Swing is not winning any awards, it is a rock solid
functional GUI toolkit that powers applications like the JetBrains IDEs.

Swing is not even the most deployed Java-based GUI widget toolkit: that accollade goes to the Android ecosystem.

I pretty much just need to know Swing so that I can debug, extend and create Intellij plugins.


## Instructions

Follow these instructions to build and run the demo Swing-based desktop GUI program.

1. Pre-requisite: Java 17
2. Build and run the program:
   * ```shell
     ./gradlew run
     ```
3. A window will appear
   * Type in the name of a class, like `java.util.List`
   * Click the "Search" button
   * The program will look up the class and display its public methods in the window


## Wish List

General clean-ups, TODOs and things I wish to implement for this project:

* [ ] Incorporate FlatLaf
* [ ] Style the window much better.
* [ ] Make multiple different subprojects. I'm not sure exactly what I need to explore, but Intellij plugin development
  will give me some ideas.
* [ ] Consider using Kotlin as a way to compare and contrast. I think GUI object-oriented/application/widget code can be
  especially verbose so Kotlin might be a good fit. 
* [ ] Do something with a non-main thread (the non Event Dispatch Thread (EDT)) to see how that makes you write Swing
  code differently.


## Reference

* [JavaDoc: package `javax.swing`](https://docs.oracle.com/en/java/javase/21/docs/api/java.desktop/javax/swing/package-summary.html)
* [FlatLaf - Swing Look and Feel (with Darcula/IntelliJ themes support)](https://github.com/JFormDesigner/FlatLaf)
* [The Java Tutorials: *Trail: Creating a GUI With Swing*](https://docs.oracle.com/javase/tutorial/uiswing/)
