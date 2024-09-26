package com.example.leetcode.ibm_assessment


/*
 * Complete the 'getFinalImage' function below.
 *
 * The function is expected to return a 2D_INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. 2D_INTEGER_ARRAY image
 *  2. INTEGER rotation
 *  3. INTEGER vertical_flip
 *  4. INTEGER horizontal_flip
 */

fun main() {
    val input = arrayOf(arrayOf(1, 0, 0), arrayOf(0, 1, 1), arrayOf(0, 0, 1))
   getFinalImage(input, 270, 0, 1).forEach {
       println(it.contentToString())
   }
}

fun getFinalImage(
    image: Array<Array<Int>>,
    rotation: Int,
    vertical_flip: Int,
    horizontal_flip: Int
): Array<Array<Int>> {
    // Write your code here
    var result = Array(image.size) { Array(image.size) { 0 } }
    val n = image.size

    when (rotation) {
        270 ->
            for (i in image.indices) {
                val column = image[i]
                for (j in column.indices) {
                    result[n - 1 - j][i] = image[i][j]
                }
            }

        180 ->
            for (i in image.indices) {
                val column = image[i]
                for (j in column.indices) {
                    result[n - 1 - i][n - 1 - j] = image[i][j]
                }
            }

        90 ->
            for (i in image.indices) {
                val column = image[i]
                for (j in column.indices) {
                    result[j][n - 1 - i] = image[i][j]
                }
            }
    }

    if (vertical_flip == 1)
        result = verticalFlip(result)

    if (horizontal_flip == 1)
        result = horizontalFlip(result)

    return result
}

private fun verticalFlip(image: Array<Array<Int>>): Array<Array<Int>> {
    val result = Array(image.size) { Array(image.size) { 0 } }
    for (i in image.indices) {
        val column = image[i]
        for (j in column.indices) {
            result[image.size - 1 - i][j] = image[i][j]
        }
    }
    return result
}

private fun horizontalFlip(image: Array<Array<Int>>): Array<Array<Int>> {
    val result = Array(image.size) { Array(image.size) { 0 } }
    for (i in image.indices) {
        val column = image[i]
        for (j in column.indices) {
            result[i][image.size - 1 - j] = image[i][j]
        }
    }
    return result
}