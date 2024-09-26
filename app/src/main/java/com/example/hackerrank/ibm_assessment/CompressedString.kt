package com.example.leetcode.ibm_assessment

fun main(){
    val input = "abaaass"
    println(compressedString(input))
}

/*
 * Complete the 'compressedString' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING message as parameter.
 */

fun compressedString(message: String): String {
    // Write your code here
    if(message.isEmpty())
        return message

    var resultString = message[0].toString()

    var counter = 1
    for(i in 1..<message.length){
        if(message[i] == message[i-1])
            counter++
        else{
            if(counter > 1)
                resultString += counter.toString()

            resultString+= message[i]
            counter = 1
        }
    }
    if(counter > 1)
        resultString += counter.toString()

    return resultString
}