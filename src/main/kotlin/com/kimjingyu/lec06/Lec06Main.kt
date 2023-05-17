package com.kimjingyu.lec06

fun main() {
}

fun forEach() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }
}

fun traditionFor1() {
    for (i in 1..3) {
        println(i)
    }
}

fun traditionalFor2() {
    for (i in 3 downTo 1) {
        println(i)
    }
}

fun traditionalFor3() {
    for (i in 1..5 step 2) {
        println(i)
    }
}

fun traditionalWhile() {
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}