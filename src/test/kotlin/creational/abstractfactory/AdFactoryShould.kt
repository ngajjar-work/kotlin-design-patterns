package creational.abstractfactory

import com.ngajjarwork.designpatterns.creational.abstractfactory.AdFactory
import com.ngajjarwork.designpatterns.creational.abstractfactory.FacebookAdFactory
import com.ngajjarwork.designpatterns.creational.abstractfactory.GoogleAdFactory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AdFactoryShould {


    @Test
    fun returnGoogleFactoryForGoogleType() {

        val factory = AdFactory.createFactory<GoogleAdFactory>()
        val bannerAds = factory.createBannerAd()
        val interstitialAd = factory.createInterstitialAd()

        //try to access methods and check log
        bannerAds.loadAd()
        bannerAds.displayAd()

        //try to access methods and check log
        interstitialAd.loadAd()
        interstitialAd.displayAd()

        Assertions.assertTrue(factory is GoogleAdFactory)
    }

    @Test
    fun returnGoogleFactoryForFacebookType() {

        val factory = AdFactory.createFactory<FacebookAdFactory>()
        val bannerAds = factory.createBannerAd()
        val interstitialAd = factory.createInterstitialAd()

        //try to access methods and check log
        bannerAds.loadAd()
        bannerAds.displayAd()

        //try to access methods and check log
        interstitialAd.loadAd()
        interstitialAd.displayAd()

        Assertions.assertTrue(factory is FacebookAdFactory)
    }

}