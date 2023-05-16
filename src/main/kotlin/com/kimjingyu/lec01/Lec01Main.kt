package com.kimjingyu.lec01

import com.lannstark.lec01.Person

fun main() {

    // 1. 변수 선언 키워드 - var와 val의 차이점
    // 모든 변수는 우선적으로 val로 만들고, 꼭 필요한 경우에 var로 변경한다.
    var number1 = 10L
    val number2 = 10L

    // 2. Kotlin에서 Primitive Type
    /** 숫자, 문자, boolean과 같은 몇몇 타입은 실행시에는 Primitive Value로 표현되지만,
     * 코드에서는 평범한 클래스처럼 보인다.
     * 즉, 프로그래머가 boxing/ unboxing을 고려하지 않아도 되도록 Kotlin이 알아서 처리해준다.
     */
    var number11: Long = 10L
    println(number11)
    val number22: Long = 10L

    // 3. Kotlin에서의 nullable 변수
    // Kotlin에서 null이 변수에 들어갈 수 있다면 -> 타입?
    var number3: Long? = 1_000L
    number3 = null
    println(number3)

    // 4. Kotiln에서의 객체 인스턴스화
    // Kotiln에서 객체 인스턴스화를 할 때는 new를 붙이지 않아야 한다.
    val person = Person("김진규")
    println(person.name)
}