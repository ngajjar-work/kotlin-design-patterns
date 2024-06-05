package com.ngajjarwork.designpatterns.creational.abstractfactory

interface BannerAd {
    fun loadAd()
    fun displayAd()
}

class FacebookBannerAd : BannerAd {
    override fun loadAd() {
        println("Loading Facebook Banner Ad")
    }

    override fun displayAd() {
        println("Displaying Facebook Banner Ad")
    }
}

class GoogleBannerAd : BannerAd {
    override fun loadAd() {
        println("Loading Google Banner Ad")
    }

    override fun displayAd() {
        println("Displaying Google Banner Ad")
    }
}
