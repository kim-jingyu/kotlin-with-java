package com.kimjingyu.lec10

class Penguin (
    species: String
) : Animal(species, 2) {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱")
    }

    // 추상클래스 Animal 에서 자동으로 만들어진 getter 를 override
    override val legCount: Int
        get() = super.legCount + this.wingCount
}