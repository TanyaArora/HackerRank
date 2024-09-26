package com.example.leetcode.hacker_rank.problem_solving.basic.medium

fun main() {
    val input = arrayOf(arrayOf(5, 3, 4), arrayOf(1, 5, 8), arrayOf(6, 4, 2))
    formingMagicSquare(input)
}

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    // Write your code here

    val size = s.size
    var rowSum = IntArray(size) { 0 }
    var columnSum = IntArray(size) { 0 }
    var diagonalSum = IntArray(2) { 0 }

    for (i in 0..<size) {
        val row = s[i]
        for (j in 0..<size) {
            rowSum[i] += row[j]
            columnSum[j] += row[j]
            if (i == j)
                diagonalSum[0] += row[j]
            if (i + j == size - 1)
                diagonalSum[1] += row[j]
        }
    }

    println(rowSum.contentToString())
    println(columnSum.contentToString())
    println(diagonalSum.contentToString())


    return 0
}