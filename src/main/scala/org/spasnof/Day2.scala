package org.spasnof

import scala.util.control.Exception

object Day2 {


  class Exit extends Exception

  def scanOptCodes(optCode: Int, posOne: Int, posTwo: Int, inputSeq: Seq[Int]): Any = {
    val code = optCode match {
      case 1 => "add"
      case 2 => "multiply"
      case 99 => throw new Exit()
      case _ => throw new Exception(s"Invalid optcode ${optCode.toString} encountered")
    }
    code
  }

  def replaceSeqValues(inputSeq: Seq[Int],
                       ix1: Int,
                       ix2: Int,
                       replaceIx:Int,
                       replaceFunction: (Int, Int) => Int): Seq[Int] = {

    val i1 = inputSeq(ix1)
    val i2 = inputSeq(ix2)
    val newVal = replaceFunction(i1,i2)
    inputSeq.updated(replaceIx, newVal)
  }


  def main(args: Array[String]): Unit = {

    import scala.io.Source

    val ADDCODE = 0;
    val MULTIPLYCODE = 1;

    val filename = "day2input.txt"

    for (line <- Source.fromResource(filename).getLines) {
      line.split(",")
    }
  }

}


