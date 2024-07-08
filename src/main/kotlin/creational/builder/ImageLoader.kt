package com.ngajjarwork.designpatterns.creational.builder

/**
 * The Builder Pattern separates the construction of a complex object from its representation,
 * allowing the same construction process to create different representations.
 * It involves a Director that orchestrates the building process and a Builder that
 * constructs the actual object piece by piece.
 *
 * Advantages
 * 1. Encapsulation of Construction Logic: Separates the construction process from the representation.
 * 2. Immutable Objects: Allows creation of immutable objects with flexible configurations.
 * 3. Step-by-Step Construction: Facilitates step-by-step construction of complex objects.
 * 4. Avoids Constructor Overload: Reduces the need for multiple constructors with different parameters.
 */


class ImageLoader private constructor(builder: Builder) {

    var url: String = builder.getUrl()
    var height = builder.getHeight()
    var width = builder.getWidth()
    var isCircleImage = builder.isCircleImage()

    class Builder(private val url: String) {
        private var height: Int = 50
        private var width: Int = 50
        private var isCircleImage = false

        fun setHeight(height: Int) = apply { this.height = height }
        fun setWidth(width: Int) = apply { this.width = width }
        fun setCircleImage(isCircleImage: Boolean) = apply { this.isCircleImage = isCircleImage }

        fun getUrl() = url
        fun getWidth() = width
        fun getHeight() = height
        fun isCircleImage() = isCircleImage


        fun build() = ImageLoader(this)
    }

    fun loadImage() {
        println("Image Loaded, width = $width, height =$height and isCircleImage = $isCircleImage")
    }
}
