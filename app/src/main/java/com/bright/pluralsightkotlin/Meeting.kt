package com.bright.pluralsightkotlin

import java.lang.IllegalArgumentException

class Meeting {

    private val logger = Logger()

    //mutable
    var meetingName: String = ""

    //MARK: dummy to add participant
    fun addNameOrParticipant(participant: Participant) {
        if (verifyParticipant(participant))
            print("Added ${participant.participantName}")
    }

    //MARK: showing private
    private fun verifyParticipant(participant: Participant): Boolean {
        print("Verified ${participant.participantName}")
        return true
    }

    protected fun verifyMeeting() {

    }

}

//MARK: external class
class Participant {
    var name: Name = Name()
    var email = ""

    //MARK: accessible the name property
    val participantName
        get() = name.name

    val canonicalEmail
        get() = email.toUpperCase()
}

//MARK: validate a filed using class
class Name {
    var name: String = ""
        set(value) {
            if (value.isNullOrEmpty()) throw IllegalArgumentException()
            field = value
        }
}