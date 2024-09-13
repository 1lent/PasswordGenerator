package com.lentuwu

fun main() {
    val lower = "qwertyuiopasdfghjklzxcvbnm"
    val upper = lower.uppercase()
    val symbols = "!@#$%^&*()_.><?/+"
    val together = lower + upper + symbols


    for (chars in 1..8) {
        val randomChars = together.random()
        print(randomChars)
    }
}

/*
*
* first prototype making my own as yt made it look harder than it really is lmfao
*
* */