package com.kimjingyu.lec15

import java.util.Collections

class ListWithJava() {
    val list = listOf(100, 200)
    val unmodifiableList = Collections.unmodifiableList(list)
    val modifiableList = mutableListOf(100, 200)
}

fun main() {

}

private fun mapTest() {
    val map = mutableMapOf<Int, String>()
    map.put(1, "MONDAY")
    map.put(2, "TUESDAY")
//    map[1] = "MONDAY"
//    map[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in map.keys) {
        println("$key ${map[key]}")
    }

    for ((key, value) in map.entries) {
        println("$key $value")
    }
}

private fun setTest() {
    //    val numbers = setOf(100, 200) // 불변
    val numbers = mutableSetOf(100, 200)    // 가변

    // For Each
    for (number in numbers) {
        println("number = $number")
    }

    // 전통적인 for문
    for ((index, number) in numbers.withIndex()) {
        println("$index $number")
    }
}

private fun listTest() {
    //    val numbers = listOf(100, 200) // 불변 리스트
    val numbers = mutableListOf(100, 200)
    numbers.add(300)

    val emptyList = emptyList<Int>()

    useNumbers(emptyList()) // 타입 추론 가능시, 생략 가능

    // 하나 가져오기
    println(numbers[0])

    // for each
    for (number in numbers) {
        println("number = $number")
    }

    // 전통적인 for문
    for ((index, value) in numbers.withIndex()) {
        println("index, value = $index, $value")
    }
}

private fun useNumbers(numbers: List<Int>) {

}

private fun arrayTest() {
    val arr = arrayOf(100, 200)
    arr.plus(300) // 배열에 새로운 element 추가

    // 방법 1
    for (i in arr.indices) {
        println("$i ${arr[i]}")
    }

    // 방법 2
    for ((idx, value) in arr.withIndex()) {
        println("$idx $value")
    }
}