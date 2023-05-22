package com.kimjingyu.lec12

class Person private constructor(
    private val name: String,
    private val age: Int
){
    companion object Factory : Log{
        private const val MIN_AGE = 1;

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("LOG")
        }
    }
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}