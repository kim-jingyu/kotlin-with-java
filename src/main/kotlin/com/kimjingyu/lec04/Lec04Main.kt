package com.kimjingyu.lec04

import com.lannstark.lec04.JavaMoney

fun main(){
    println(operatorOverloading())
}

// 2. 비교 연산자
fun comparisonOperator(): Boolean {
    val money1 = JavaMoney(1000L)
    val money2 = JavaMoney(2000L)

    return money1 > money2
}

// 4. 연산자 오버로딩
fun operatorOverloading() {
    val money1 = JavaMoney(1000L)
    val money2 = JavaMoney(2000L)
    println(money1 + money2)
}