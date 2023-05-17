package com.kimjingyu.lec05

fun main() {
    judgeNumber2(0)
}

// if문
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없다.")
    }
}

// Expression & Statement - if / else
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "Pass"
    } else {
        "Fail"
    }
}

// Expression & Statement - if / else if / else
fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

// Switch -> When
fun getGradeWithSwitch1(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

// 조건부에는 어떠한 expression 이라도 들어갈 수 있다.
fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")    // smart casting
        else -> false
    }
}

// 조건부에서는 여러개의 조건을 동시에 검사할 수 있다. ( , 로 구분한다. )
fun judgeNumber1(number: Int) {
    return when (number) {
        1, 0, -1 -> println("어디서 많은 본 숫자")
        else -> println("듣도보도 못한 숫자")
    }
}

// 값이 없을수도 있다. -> early return 처럼 동작
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}