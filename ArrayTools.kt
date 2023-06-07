fun main() {
    averageArrayTester()
}

/**
* This function takes in an array of integers and 
* calculates the average value of the numbers.
*
* @param inputArray - Array of Integers
* @return Double - Average value as a Double
*/
fun averageArray(inputArray: Array<Int>): Double {
    var sum = 0.0
    for (number in inputArray) {
        sum += number
    }
    return sum/inputArray.size
}

fun averageArrayTester() {
    println(averageArray(arrayOf(1,2,3))) // Except: 2
    println(averageArray(arrayOf(-1,2,-3))) // Expect: -2/3
    println(averageArray(arrayOf(-1909))) // Expect: -1909
}