package com.bright.pluralsightkotlin

fun main() {
    val meeting = Meeting(meetingName = "Bright")
    val name = Name()
    val participant = Participant(name,email = "bright@gmail.com")
    meeting.addNameOrParticipant(participant)
}