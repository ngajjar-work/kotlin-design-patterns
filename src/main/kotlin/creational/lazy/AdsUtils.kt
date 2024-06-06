package com.ngajjarwork.designpatterns.creational.lazy


class AdsUtils {

    // The preferenceManager property is declared with `by lazy`. This means
    // it will be initialized only the first time it's accessed.
    private val preferenceManager: PreferenceManager by lazy {
        PreferenceManager() // This lambda defines the initialization logic
    }

    fun showBannerAds() {
        println("Banner ads is displaying")
        // This method doesn't use preferenceManager, so it won't be initialized
    }

    fun showNativeAds() {
        println("Native ads is displaying")
        // This method accesses preferenceManager, triggering its initialization
        // if it hasn't happened yet.
        preferenceManager.increaseNativeAdCount()
    }
}


//another way to use lazy
class AdsUtils2 {

    // The preferenceManager property is declared with `lateinit var`. This
    // means it must be initialized before being used, but it allows us to
    // control the initialization logic.
    private lateinit var preferenceManager: PreferenceManager

    fun showBannerAds() {
        println("Banner ads is displaying")
    }

    fun showNativeAds() {
        println("Native ads is displaying")
        // We call getPreferenceManager() to ensure initialization before using it
        getPreferenceManager().increaseNativeAdCount()
    }

    // This method is responsible for initializing preferenceManager if needed
    private fun getPreferenceManager(): PreferenceManager {
        if (!::preferenceManager.isInitialized) {
            preferenceManager = PreferenceManager()
        }
        return preferenceManager
    }
}

