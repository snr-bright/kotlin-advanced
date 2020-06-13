package com.bright.pluralsightkotlin

fun main() {
    val meeting = Meeting()
    val participant = Participant()
    participant.name = "Bright"
    participant.email = "bright@gmail.com"
    meeting.addNameOrParticipant(participant)
}