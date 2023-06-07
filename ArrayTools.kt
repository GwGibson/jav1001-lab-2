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
    if (inputArray.isEmpty()) { // Avoid divide by 0 in return
        return 0.0 
    }
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
    println(averageArray(arrayOf(-0))) // Expect: 0
    println(averageArray(arrayOf()))
}