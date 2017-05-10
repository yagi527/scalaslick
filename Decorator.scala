/**
  * Created by osboxes on 11/04/17.
  */
package demo;

import structural.FileReader1;
import structural.UpperCaseReader;
import structural.WhiteSpaceCleanReader;
import structural.InputReader;

object decorator {
  def main(args: Array[String]): Unit = {
    println("UpperCaseInput")
    println(new UpperCaseReader(new InputReader()).read())
    println("WhiteSpaceCleanInput")
    println(new WhiteSpaceCleanReader(new InputReader()).read())
    println("UpperCaseInput WhiteSpaceClean")
    println(new UpperCaseReader(new WhiteSpaceCleanReader(new InputReader())).read())

    println("FileReader")
    println(new FileReader1("/home/osboxes/test.txt").read())
    println("UpperCaseFile")
    println(new UpperCaseReader(new FileReader1("/home/osboxes/test.txt")).read())
    println("WhiteSpaceCleanFile")
    println(new WhiteSpaceCleanReader(new FileReader1("/home/osboxes/test.txt")).read())
    println("UpperCaseFile WhiteSpaceClean")
    println(new UpperCaseReader(new WhiteSpaceCleanReader(new FileReader1("/home/osboxes/test.txt"))).read())
  }
}





