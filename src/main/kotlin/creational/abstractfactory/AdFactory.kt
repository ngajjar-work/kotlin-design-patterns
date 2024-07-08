package com.ngajjarwork.designpatterns.creational.abstractfactory

/**
 * Abstract Factory is a creational design pattern that lets you produce
 * families of related objects without specifying their concrete classes.
 *
 * Advantages
 * 1. Encapsulation of Object Creation: Hides the details of object creation and provides a common interface.
 * 2. Consistency: Ensures that products from the same family are used together, promoting consistency.
 * 3. Extensibility: Allows for easy extension of new product families without modifying existing code.
 * 4. Flexibility: Enables the creation of different families of objects based on context.
 */

abstract class AdFactory {
    abstract fun createBannerAd(): BannerAd
    abstract fun createInterstitialAd(): InterstitialAd

    companion object {
        inline fun <reified T : AdFactory> createFactory(): AdFactory =
            when (T::class) {
                FacebookAdFactory::class -> FacebookAdFactory()
                GoogleAdFactory::class -> GoogleAdFactory()
                else -> throw IllegalArgumentException("Unknown factory type")
            }
    }
}

class FacebookAdFactory : AdFactory() {
    override fun createBannerAd(): BannerAd {
        return FacebookBannerAd()
    }

    override fun createInterstitialAd(): InterstitialAd {
        return FacebookInterstitialAd()
    }
}

class GoogleAdFactory : AdFactory() {
    override fun createBannerAd(): BannerAd {
        return GoogleBannerAd()
    }

    override fun createInterstitialAd(): InterstitialAd {
        return GoogleInterstitialAd()
    }
}


