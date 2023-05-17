package com.kimjingyu.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
}

// 1. try catch finally 구문 - 주어진 문자열을 정수로 변경
fun parseIntOrThrow(str: String): Int{
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

// 주어진 문자열을 정수로 변경 - 실패하면 null 반환
fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// 프로젝트 내 파일의 내용물을 읽어오는 예제
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/file.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}