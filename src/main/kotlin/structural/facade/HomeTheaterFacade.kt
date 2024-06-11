package com.ngajjarwork.designpatterns.structural.facade

class HomeTheaterFacade(
    private val amplifier: Amplifier,
    private val dvdPlayer: DVDPlayer,
    private val projector: Projector
) {

    fun watchMovie(movie: String) {
        println("Get ready to watch a movie...")
        amplifier.on()
        amplifier.adjustVolume(5)
        dvdPlayer.on()
        dvdPlayer.play(movie)
        projector.on()
        projector.wideScreenMode()
    }

    fun endMovie() {
        println("Shutting movie theater down...")
        amplifier.off()
        dvdPlayer.stop()
        dvdPlayer.off()
        projector.off()
    }
}
