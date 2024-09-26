package com.example.leetcode.hacker_rank.problem_solving.basic.easy

fun main(){
    staircase(6)
}

fun staircase(n: Int): Unit {
    // Write your code here
    for(i in 1..n){
        for (j in 1..n-i)
            print(" ")
        for(k in 1..i)
            print("#")
        println()
    }
}