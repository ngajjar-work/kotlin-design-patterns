package com.ngajjarwork.designpatterns.creational.abstractfactory

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


