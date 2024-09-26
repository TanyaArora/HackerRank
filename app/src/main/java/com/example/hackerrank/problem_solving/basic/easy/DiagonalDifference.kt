package com.example.leetcode.hacker_rank.problem_solving.basic.easy

import kotlin.math.abs

fun main() {
    val input = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(9,8,9))
    println(diagonalDifference(input))
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    // 00,01,02,03
    // 10,11,12,13
    // 20,21,22,23
    // 30,31,32,33

    var result = 0
    for (i in arr.indices) {
        val left = arr[i][i]
        val right = arr[i][arr.size-1-i]
        result = result + left - right
    }
    return abs(result)
}