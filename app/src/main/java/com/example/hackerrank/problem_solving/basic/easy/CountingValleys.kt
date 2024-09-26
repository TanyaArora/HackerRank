package com.example.leetcode.hacker_rank.problem_solving.basic.easy

fun main() {
    println(countingValleys(8, "DU"))
}

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var counter = 0
    var valleys = 0

    for (c in path) {
        if (c == 'D' && counter == 0)
            valleys++

        if (c == 'D')
            counter--
        else if (c == 'U')
            counter++
    }
    return valleys
}