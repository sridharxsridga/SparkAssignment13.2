/*
 * program to search nth element from the sequence using  recursion function.
 *
 */


package fibonacciSeriesGeneration

import scala.util.control.Breaks

object searchSequenceRecursive {

  def main(args: Array[String]): Unit = {
    //Initialize and add elements to Sequence
    var Sequence: Seq[Int] = Seq(34, 67, 89, 34, 5, 67, 83, 34, 77)

    println("Enter the nth element to be found :")
    //Read input from standard input by using StdiIn.readInt() which needs to be searched
    val searchElement: Int = scala.io.StdIn.readInt()

    // create a Breaks object 
    val loop = new Breaks;
    var notFound = 0
    var value: Int = 0;  // Index of sequence
    
    println("Using recursive to search the Element")

    
    
    //Calling recursive function to get the index of element
    
    resursiveSearch(value)

    /*
     * Recursive function which searches element in sequence and prints its index
     * 
     */
    def resursiveSearch(value: Int): Unit = {
    //Getting the index of sequence
      var index = value
      
    // if index is less than the size of the sequence then only proceed for searching
      if (index < Sequence.length) {
        
        //Getting the element of sequence 
        var seqVal = Sequence(index)

        //breakable function to use break statement
        loop.breakable {
        // if element is equal to the search element print the index of it else tries to match with the next element of sequence 
          if (seqVal == searchElement) {
            println("element found at index " + Sequence.indexOf(seqVal))
            //break statement if element is found
            loop.break;
          } else {
            
            //incrementing index to be matched
            index += 1
            //calling recursively
            resursiveSearch(index)
            //incrementing notFound variable to check if element does not exist
            notFound += 1
          }
        }
      }
    }
 //Check notFould is iterated till all the element of sequence and has not found the search element then print the element does not exist
    if (notFound == Sequence.length) println("Number does not exist in the sequence")

    
  }

}