package com.ngajjarwork.designpatterns.structural.facade

class DVDPlayer {

    var isOn = false
    var currentMovie: String? = null

    fun on() {
        isOn = true
        println("DVD Player is on.")
    }

    fun off() {
        isOn = false
        println("DVD Player is off.")
    }

    fun play(movie: String) {
        currentMovie = movie
        println("Playing movie: $movie")
    }

    fun stop() {
        currentMovie = null
        println("Stopped playing movie.")
    }
}