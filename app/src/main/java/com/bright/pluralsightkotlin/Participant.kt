package com.bright.pluralsightkotlin

//MARK: external class
class Participant(private val name: Name, val email: String) {
    //MARK: accessible the name property
    val participantName
        get() = name.name

    val canonicalEmail
        get() = email.toUpperCase()
}
