package com.ngajjarwork.designpatterns.structural.facade

class Projector {

    var isOn = false
    var isWideScreen = false

    fun on() {
        isOn = true
        println("Projector is on.")
    }

    fun off() {
        isOn = false
        isWideScreen = false
        println("Projector is off.")
    }

    fun wideScreenMode() {
        isWideScreen = true
        println("Projector is in widescreen mode.")
    }
}
