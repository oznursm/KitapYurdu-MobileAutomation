package com.testinium.And.PageSteps;

import com.testinium.And.Util.Driver.DriverFactory;
import com.testinium.And.Pages.LandingPage;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.android.AndroidDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LandingPageGaugeSteps {

    private static final Logger log = LoggerFactory.getLogger(LandingPageGaugeSteps.class);
    private LandingPage landingPage = new LandingPage();
    private AndroidDriver driver;

    @Step("Örnek test case'i çalıştırr")
    public void ornekTestCaseCalistir() throws Exception {
        log.info("Gauge: Örnek test case'i çalıştırılıyor...");
        driver = DriverFactory.getDriver();
        Thread.sleep(2000);
    }

    @Step("Control <countryCode> Country Clicking")
    public void controlCountryClicking(String countryCode) {
        log.info("Gauge: " + countryCode + " ülkesi kontrol ediliyor ve tıklanıyor");
        landingPage.clickCountry(countryCode);
    }

    @Step("Kullanıcı bilgileri girilir")
    public void kullaniciGirisBilgileri() throws InterruptedException {
        LandingPage.logoLogin();
    }

    @Step("Kullanıcı Giriş İşlemleri")
    public void kullaniciIsim() {
        LandingPage.logoIsim();
    }
}
