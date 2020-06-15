package com.bright.pluralsightkotlin

import java.lang.IllegalArgumentException

//MARK: validate a filed using class
class Name(val name: String = "") {
    init {
        if (name.isBlank()) throw IllegalArgumentException()
    }
//    var name: String = ""
//        set(value) {
//            if (value.isNullOrEmpty()) throw IllegalArgumentException()
//            field = value
//        }
}