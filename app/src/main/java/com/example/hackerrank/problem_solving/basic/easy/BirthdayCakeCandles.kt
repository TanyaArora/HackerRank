package com.example.leetcode.hacker_rank.problem_solving.basic.easy

import kotlin.math.max

fun main() {
    val input = arrayOf(4, 4, 1, 3)
    println(birthdayCakeCandles(input))
}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    val map = hashMapOf<Int, Int>()
    var maxValue = Int.MIN_VALUE

    candles.forEach {
        map[it] = map.getOrPut(it) { 0 } + 1
        maxValue = max(maxValue, it)
    }

    return map.getOrDefault(maxValue, 0)
}