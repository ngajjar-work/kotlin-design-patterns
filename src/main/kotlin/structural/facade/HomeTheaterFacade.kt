package com.ngajjarwork.designpatterns.structural.facade

/**
 * The Facade Pattern is a structural design pattern that provides a simplified interface to a complex subsystem.
 * It hides the complexities of the subsystem by offering a unified interface, making it easier to use and integrate.
 *
 * Advantages
 * 1. Simplified Interface: Provides a simple, unified interface to a complex subsystem, making it easier to use.
 * 2. Encapsulation: Hides the complexities of the subsystem and reduces the coupling between client code and subsystem components.
 * 3. Improved Code Readability: Makes client code more readable by avoiding direct interaction with complex subsystems.
 * 4. Ease of Maintenance: Facilitates easier maintenance and modification of the subsystem without affecting client code.
 */


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
