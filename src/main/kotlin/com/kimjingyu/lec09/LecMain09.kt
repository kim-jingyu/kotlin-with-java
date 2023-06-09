package com.kimjingyu.lec09

import com.lannstark.lec09.JavaPerson

// 부생성자 사용
class KotlinPerson1(
    // 주생성자
    name: String,
    age: Int
){
    val name = name
    var age = age

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이(${age})는 1 이상이어야 합니다.")
        }
        println("초기화 블록")
    }

    // 부생성자 - 최초로 태어나는 아기는 무조건 1살이다.
    constructor(name: String): this(name, 1){
        println("부생성자1")
    }

    constructor() : this("user"){
        println("부생성자2")
    }

    override fun toString() = "KotlinPerson(name=${name}, age=${age})"
}

// default parameter 사용
class KotlinPerson2(
    val name: String = "user",
    var age: Int = 100
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이(${age})는 1 이상이어야 합니다.")
        }
    }

    override fun toString() = "KotlinPerson(name=${name}, age=${age})"
}

// 3. custom getter, setter. 성인인지 확인
class KotlinPerson3(
    name: String,
    val age: Int
){
//    fun isAdult(): Boolean{
//        return this.age >= 20
//    }

//    val isAdult: Boolean
//        get() = this.age >= 20

    val isAdult: Boolean
        get() {
            return this.age >= 20
        }

    // name 을 get 할 때, 무조건 대문자로 바꾸기

    // backing field
//    val name: String = name
//        get() = field.uppercase()

//    val upperCaseName: String
//        get() = this.name.uppercase()


    // name 을 set 할 때, 무조건 대문자로 바꿔주기
    var name: String = name
        set(value) {
            field = value.uppercase()
        }
}


fun main() {
    val kotlinPerson3 = KotlinPerson3("user", 10)
    println(kotlinPerson3.name)
}

private fun classAndProperty() {
    // kotlin class 이용
    val kotlinPerson1 = KotlinPerson1("kotlinUser", 100)
    // getter
    println(kotlinPerson1.name)
    // setter
    kotlinPerson1.age = 10
    println("kotlinPerson.age = ${kotlinPerson1.age}")

    // java class 이용
    val javaPerson = JavaPerson("javaUser", 30)
    // getter
    println(javaPerson.name)
    // setter
    javaPerson.age = 50
    println("javaPerson.age = ${javaPerson.age}")
}