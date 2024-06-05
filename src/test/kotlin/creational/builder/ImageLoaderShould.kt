package creational.builder

import com.ngajjarwork.designpatterns.creational.builder.ImageLoader
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ImageLoaderShould {
    val url = "www.test.com"
    val height = 100
    val width = 50

    @Test
    fun haveProperDefaultParameter() {

        val imageLoader = ImageLoader.Builder("www.test.com").build()
        imageLoader.loadImage()

        assertEquals(url, imageLoader.url)
    }

    @Test
    fun haveProperCustomParameters() {

        val imageLoader = ImageLoader.Builder("www.test.com")
            .setHeight(height)
            .setWidth(width)
            .setCircleImage(true)
            .build()

        imageLoader.loadImage()

        assertEquals(height, imageLoader.height)
        assertEquals(width, imageLoader.width)
        assertTrue(imageLoader.isCircleImage)
    }
}