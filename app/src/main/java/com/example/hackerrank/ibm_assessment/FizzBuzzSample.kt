package com.example.leetcode.ibm_assessment

fun main() {
    fizzBuzz(15)
}

fun fizzBuzz(n: Int): Unit {
    // Write your code here
    val fizz = "Fizz"
    val buzz = "Buzz"

    for(i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0)
            println(fizz + buzz)
        else if (i % 3 == 0)
            println(fizz)
        else if (i % 5 == 0)
            println(buzz)
        else
            println(i)
    }

}