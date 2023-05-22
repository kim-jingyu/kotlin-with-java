package com.kimjingyu.lec14

fun main() {
    handelCar(Sonata())
}

private fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

private fun handelCar(car: HyundaiCar) {
    when (car) {
        is Avante -> println("아반테")
        is Grandeur -> println("그랜져")
        is Sonata -> println("소나타")
    }
}