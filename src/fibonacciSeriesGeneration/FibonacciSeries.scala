/*
 * program to calculate and print Fibonacci number using both recursion  and for Loop.
 *
 */


package fibonacciSeriesGeneration

object FibonacciSeries {
  def main(args: Array[String]): Unit = {

    println("Enter the n number of series")

    /*Read input to print Fibonacci series upto how many numbers
     *from standard input by using StdiIn.readInt()
     */
    val nDigit = scala.io.StdIn.readInt()
    var firstVal = 0
    var secondVal = 1

    println("Fibonacci Series using  standard for  loop : ")

    //Will display nDigit numbers in the sequence
    for (number <- 1 to nDigit) {

      print(secondVal)

      //add firstVal and secondVal
      var fibVal = firstVal + secondVal

      // firstVal will equal secondVal due to the fact the Fib Seq adds the previous number with the current
      firstVal = secondVal

      // secondVal wil equal the new fib Number so it can be repeated

      secondVal = fibVal
    }

    println("\r\n" + "Fibonacci Series using  recursion : ")

    //Will display nDigit numbers in the sequence
    for (number <- 1 to nDigit) {
      print(fibonacci(number)) //calling function

    }

    // This function  uses tail recursion to calculate Fibonacci number for a given number
    def fibonacci(value: Int): Int = {
      if (value <= 1)
        value
      else
        fibonacci(value - 1) + fibonacci(value - 2) //tail recursion
    }

  }
}
