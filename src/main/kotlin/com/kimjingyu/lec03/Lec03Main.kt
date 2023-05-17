package com.kimjingyu.lec03

import com.lannstark.lec03.Person

fun main() {
    // 타입 캐스팅
    val person1 = Person("김진규", 100)
    printAgeIfPerson1(person1)
    printAgeIfPerson2(null)

    // String interpolation
    println(interpolation2())
}

// 1. 기본 타입
fun primitiveType() {
    // 타입변환시 to변환타입() 메서드를 사용해야 한다.
    val number1: Int = 4
    val number2: Long = number1.toLong()

    println(number1 + number2)

    val number3 = 3
    val number4 = 5
    val result = number3 / number4.toDouble()

    println(result)

    // 변수가 nullable 이라면 적절한 처리가 필요하다.
    val number5: Int? = 3
    val number6: Long = number1?.toLong() ?: 0L
}

// 2. 타입 캐스팅

// 기본 타입이 아닌 일반 타입은?
fun printAgeIfPerson1(obj: Any){
    if (obj is Person) {
//        val person = obj as Person
//        println(person.age)

        // 스마트 캐스트
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    // 안전한 타입 형변환
    val person = obj as? Person
    println(person?.age)
}

fun interpolation1(): String {
    val person = Person("김진규", 100)
    val log = "사람의 이름은 ${person.name}이고, 나이는 ${person.age}세 입니다."
    return log
}

fun interpolation2(): String{
    val person = Person("김진규", 100)
    val withoutIndent =
        """
            사람 이름은 
            ${person.name}이고, 
            나이는 ${person.age}
            세 입니다.
        """.trimIndent()
    return withoutIndent
}