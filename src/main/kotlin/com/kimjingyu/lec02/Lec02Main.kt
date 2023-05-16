package com.kimjingyu.lec02

import com.lannstark.lec02.Person

fun main() {

    var str: String? = "abc"
    // Safe Call: null이 아니면 실행하고, null이면 실행하지 않는다.(그대로 null)
    println(str?.length)

    // Elvis 연산자: 앞의 연산 결과가 null이면 뒤의 값을 사용한다.
    println(str?.length ?: 0)

    // 플랫폼 타입: 코틀린이 null 관련 정보를 알 수 없는 타입
    // runtime 시에 NPE 발생
    val person = Person(null)
    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

// Kotiln에서는 null이 가능한 타입을 완전히 다르게 취급한다.

// 1. str이 null일 경우, Exception을 낸다.
fun startsWithA1(str: String?): Boolean{
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//    return str.startsWith("A")
}

// 2. str이 null일 경우, null을 반환한다.
fun startsWithA2(str: String?): Boolean?{
    return str?.startsWith("A")
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
}

// 3. str이 null일 경우, false를 반환한다.
fun startsWithA3(str: String?): Boolean{
    return str?.startsWith("A") ?: false
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
}

// Elvis 연산은 early return 에도 사용할 수 있다.
fun calculate(number: Long?): Long {
    number ?: return 0

    // 다음 로직
    return 1L
}

// null 아님 단언 !!
// 혹시나 Null이 들어오면 NPE가 나오기에 null이 아닌게 확실한 경우에만 사용
fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}