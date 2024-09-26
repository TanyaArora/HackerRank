package com.example.leetcode.hacker_rank.problem_solving.basic.easy

fun main() {
    val input = "01:59:45aM"
    println(timeConversion(input))
}

fun timeConversion(s: String): String {
    // Write your code here

    val time = s.take(2).toInt().let {
        if (s.takeLast(2).equals("PM", true)) {
            if (it < 12)
                it + 12
            else
                it
        } else {
            if (it < 12)
                it
            else
                0
        }
    }

    return String.format("%02d%s", time, s.slice(2..s.length - 3))
}