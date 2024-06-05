package com.ngajjarwork.designpatterns.creational.abstractfactory

interface InterstitialAd {
    fun loadAd()
    fun displayAd()
}

class FacebookInterstitialAd : InterstitialAd {
    override fun loadAd() {
        println("Loading Facebook Interstitial Ad")
    }

    override fun displayAd() {
        println("Displaying Facebook Interstitial Ad")
    }
}

class GoogleInterstitialAd : InterstitialAd {
    override fun loadAd() {
        println("Loading Google Interstitial Ad")
    }

    override fun displayAd() {
        println("Displaying Google Interstitial Ad")
    }
}

