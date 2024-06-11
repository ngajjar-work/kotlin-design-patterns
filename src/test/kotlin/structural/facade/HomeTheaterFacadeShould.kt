package structural.facade

import com.ngajjarwork.designpatterns.structural.facade.Amplifier
import com.ngajjarwork.designpatterns.structural.facade.DVDPlayer
import com.ngajjarwork.designpatterns.structural.facade.HomeTheaterFacade
import com.ngajjarwork.designpatterns.structural.facade.Projector
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class HomeTheaterFacadeShould {

    private lateinit var amplifier: Amplifier
    private lateinit var dvdPlayer: DVDPlayer
    private lateinit var projector: Projector
    private lateinit var homeTheater: HomeTheaterFacade

    @BeforeEach
    fun setup() {
        amplifier = Amplifier()
        dvdPlayer = DVDPlayer()
        projector = Projector()
        homeTheater = HomeTheaterFacade(amplifier, dvdPlayer, projector)
    }

    @Test
    fun prepareToWatchMovie() {
        // Given
        val movie = "Inception"

        // When
        homeTheater.watchMovie(movie)

        //then
        assertThat(amplifier.isOn).isTrue()
        assertThat(amplifier.volume).isEqualTo(5)
        assertThat(dvdPlayer.isOn).isTrue
        assertThat(dvdPlayer.currentMovie).isEqualTo(movie)
        assertThat(projector.isOn).isTrue
        assertThat(projector.isWideScreen).isTrue

    }


    @Test
    fun shutDownTheater() {

        // When
        homeTheater.endMovie()

        // Then
        assertThat(amplifier.isOn).isFalse
        assertThat(dvdPlayer.isOn).isFalse
        assertThat(dvdPlayer.currentMovie).isNull()
        assertThat(projector.isOn).isFalse
    }

}