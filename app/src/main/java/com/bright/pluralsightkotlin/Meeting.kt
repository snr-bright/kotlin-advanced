package com.bright.pluralsightkotlin

import java.lang.IllegalArgumentException

open class Meeting(val meetingName: String, val location: Location = Location()) {

    //MARK: secondary constructor
//    constructor(meetingName: String, location: Location) : this(meetingName) {
//        this.location = location
//    }

    private val logger = Logger()

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

    protected open fun verifyMeeting() {
        print("Verify meeting")
    }
}