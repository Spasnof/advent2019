package org.spasnof

object Day1 {

  def fuelForModule(moduleMass: Int): Int = {
//    to find the fuel required for a module, take its mass, divide by three, round down, and subtract 2.
    (moduleMass / 3) - 2
  }

  def main(args: Array[String]): Unit = {

    import scala.io.Source

    var fuelNeeded = 0
    val filename = "day1input.txt"
    for (line <- Source.fromResource(filename).getLines) {
      fuelNeeded += fuelForModule(line.toInt)
    }
    println(fuelNeeded)
  }

}


