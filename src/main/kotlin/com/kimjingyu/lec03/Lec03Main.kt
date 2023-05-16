package com.kimjingyu.lec03

fun main() {

    // 1. 기본 타입: 변수가 nullable 이라면 적절한 처리가 필요하다.
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
}