package com.kimjingyu.lec13

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom(
        private var area: Double
    )
}

class House2(
    private val address: String
){
    inner class LivingRoom(
        private val area: Double
    ){
        val address: String
            get() = this@House2.address
    }
}

fun main() {
    println(House2("서울시").LivingRoom(12.0).address)
}