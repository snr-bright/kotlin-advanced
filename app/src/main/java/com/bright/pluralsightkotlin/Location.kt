package com.bright.pluralsightkotlin

open class Location()

class Room(roomName: String) : Location()

class UKAddress(
    firstLine: String,
    secondLine: String,
    city: String,
    country: String,
    postCode: String
) : Location()