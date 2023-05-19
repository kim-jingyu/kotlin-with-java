package com.kimjingyu.lec08

import com.lannstark.lec08.Lec08Main

fun main() {
    // 3. named argument
    val java = Lec08Main()
    java.repeat("안녕하세요")

    // 4. 같은 타입의 여러 파라미터 받기 (가변인자)
    val arr = arrayOf("A", "B", "C")
    java.printAll(*arr)
    java.printAll("A", "B", "C")

    printAll(*arr)
    printAll("A", "B", "C")
}

// 1. 함수 선언 문법 - 두 정수를 받아서 더 큰 정수를 반환
fun max(a: Int, b: Int) = if (a > b) a else b

// 2. 주어진 문자열을 N번 출력 - 오버로딩 -> default parameter
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

// 4. 가변인자
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}