package com.kimjingyu.lec16

import com.lannstark.lec16.Person

fun main() {
    // 멤버함수와 확장함수의 시그니처가 같을때
    val person = Person("xxx", "zzz", 100)
    println(person.nextYearAge())

    // 확장함수가 오버라이드 된다면
    val train: Train = Train()
    train.isExpensive()

    val srt1: Train = Srt()
    srt1.isExpensive()

    val srt2: Srt = Srt()
    srt2.isExpensive()

    // infix - 중위 함수
    println(3 add2 9)

    // inline 함수
    println(3.add3(4))
}

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")
    return this.price >= 10000
}

// infix 함수 - 중위 함수
fun Int.add1(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

// inline 함수
fun Int.add3(other: Int): Int {
    return this + other
}