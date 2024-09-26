package com.example.leetcode.hacker_rank.problem_solving.basic.easy

fun main() {
    val a = arrayOf(1,2,3)
    val b = arrayOf(3,2,1)
    println(compareTriplets(a, b).contentToString())
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val result = Array<Int>(2) { 0 }
    for(i in a.indices){
        if(a[i] > b[i])
            result[0]+= 1
        else if(a[i] < b[i])
            result[1]+= 1
    }
    return result
}