package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon anasayfasinda")
    public void kullaniciAmazonAnasayfasinda() {
        Driver.getDriver() .get(ConfigReader .getProperty("amazonUrl") ) ;
    }

    @Then("kullanici nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage .aramakutusu.sendKeys("nutella"+ Keys.ENTER );
        
    }

    @And("sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage .aramaSonucElemanti.getText() .contains("nutella") );
        
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver .closeDriver() ;
    }

    @Then("kullanici java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage .aramakutusu.sendKeys("java"+ Keys.ENTER ) ;
    }

    @And("sonuclarin java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage .aramaSonucElemanti .getText() .contains("java") ) ;
    }


    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenkelime) {
        amazonPage .aramakutusu.sendKeys(istenenkelime + Keys.ENTER );

    }
    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String istenenkelime) {
        Assert.assertTrue(amazonPage .aramaSonucElemanti .getText() .contains(istenenkelime ) ) ;


    }

    @Given("kullanici {string} sayfasina gider")//amazonUrl
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver .getDriver() .get(ConfigReader .getProperty(istenenUrl) );

    }

    @And("url' nin {string} icerdiğini test eder")
    public void urlNinIcerdiğiniTestEder(String istenenKelime) {
        Assert.assertTrue(Driver .getDriver() .getCurrentUrl().contains(istenenKelime ) );
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye)  {
        try {
            Thread .sleep(istenenSaniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
