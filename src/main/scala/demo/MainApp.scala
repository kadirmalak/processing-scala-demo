package demo

import processing.core.{PApplet, PConstants}

object MainApp extends PApplet {

  def main(args: Array[String]): Unit = {
    PApplet.main("demo.MainApp")
  }
}

class MainApp extends PApplet {

  override def setup(): Unit = {
    background(255, 255, 255)
  }

  override def settings(): Unit = {
    size(600, 600, PConstants.P3D)
  }

  override def draw(): Unit = {
    line(50, 50, 100, 100)
  }
}
