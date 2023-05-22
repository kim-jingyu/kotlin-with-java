package com.kimjingyu.lec10

open class Base (
    open val number: Int = 1
){
    init {
        println("Base Class")
        println(number)
    }
}