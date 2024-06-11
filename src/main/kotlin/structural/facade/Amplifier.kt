package com.ngajjarwork.designpatterns.structural.facade

class Amplifier {
    var isOn = false
    var volume = 0

    fun on() {
        isOn = true
        println("Amplifier is on.")
    }

    fun off() {
        isOn = false
        println("Amplifier is off.")
    }

    fun adjustVolume(level: Int) {
        volume = level
        println("Amplifier volume set to $level.")
    }
}