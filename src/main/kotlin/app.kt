package com.okta.developers.kotlin

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    val string = scan.nextLine()
    val result = Anagrams().count(string)

    println(result)
}

