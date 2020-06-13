package com.bright.pluralsightkotlin

class Meeting {

    private val logger = Logger()

    //mutable
    var meetingName: String = ""

    //MARK: dummy to add participant
    fun addNameOrParticipant(participant: Participant) {
        if (verifyParticipant(participant))
            print("Added ${participant.name}")
    }

    //MARK: showing private
    private fun verifyParticipant(participant: Participant): Boolean {
        print("Verified ${participant.name}")
        return true
    }

    protected fun verifyMeeting() {

    }

}

class Participant {
    var name = ""
    var email = ""
}