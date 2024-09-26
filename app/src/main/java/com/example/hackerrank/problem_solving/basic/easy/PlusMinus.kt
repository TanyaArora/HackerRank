package com.example.leetcode.hacker_rank.problem_solving.basic.easy

fun main(){
    val input = arrayOf(-4,3,-9,0,4,1)
    plusMinus(input)
}

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var posCount = 0F
    var negCount = 0F
    var zeroCount = 0F

    arr.forEach {
        if(it > 0)
            posCount++
        else if(it < 0)
            negCount++
        else
            zeroCount++
    }

    val size = arr.size.toFloat()
    println(String.format("%.6f", posCount.div(size)))
    println(String.format("%.6f", negCount.div(size)))
    println(String.format("%.6f", zeroCount.div(size)))
}