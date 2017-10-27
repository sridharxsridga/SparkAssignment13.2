/*
 * program to search nth element from the sequence using  for Loop.
 *
 */


package fibonacciSeriesGeneration

import scala.util.control.Breaks

object searchSequence  {
     
    
  def main(args: Array[String]): Unit = {
     //Initialize and add elements to Sequence
    var Sequence: Seq[Int] = Seq(34, 67, 89, 34, 5, 67, 83, 34, 77)

    println("Enter the nth element to be found :")
    //Read input from standard input by using StdiIn.readInt() which needs to be searched
    val searchElement: Int = scala.io.StdIn.readInt()


    // create a Breaks object 
    val loop = new Breaks;
    var notFound = 0
    
    //Looping through sequence
    loop.breakable {
      for (seq <- Sequence) {

        //if search element is found return the index of that element
        if (seq == searchElement) {
          println("Element found at index :" + Sequence.indexOf(seq))
           //break the loop when the  element is found
          loop.break; 
        } else

          notFound += 1  //elese increment notFound

      }
    }
    //Check notFould is iterated till all the element of sequence and has not found the search element then print the element does not exist
    if (notFound == Sequence.length) println("Number does not exist in the sequence")

    
    
    
  }
  


  
  
  
  
  
  
  
}