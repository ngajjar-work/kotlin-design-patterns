package com.ngajjarwork.designpatterns.creational.builder

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
