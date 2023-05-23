package com.kimjingyu.lec16

import com.lannstark.lec16.Person

//fun String.lastChar(): Char {
//    return this[this.length - 1]
//}

val String.lastChar: Char
    get() = this[this.length - 1]

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}