package com.kimjingyu.lec12

fun main() {
    println(Person.newBaby("user"))

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("움직이기!!")
        }
        override fun fly() {
            println("날기!!")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}