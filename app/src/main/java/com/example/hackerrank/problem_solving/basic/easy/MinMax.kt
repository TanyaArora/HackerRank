package com.example.leetcode.hacker_rank.problem_solving.basic.easy

import kotlin.math.max
import kotlin.math.min

fun main(){
    val input = arrayOf(1,3,5,7,9)
    miniMaxSum(input)
}

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    if(arr.isEmpty())
        return

    var minValue = Int.MAX_VALUE
    var maxValue = Int.MIN_VALUE
    var sum = 0

    arr.forEach {
        sum+= it
        minValue = min(minValue, it)
        maxValue = max(maxValue, it)
    }

    println("${sum-maxValue} ${sum-minValue}")
}
