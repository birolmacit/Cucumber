package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {
    HMCPage hmcPage = new HMCPage();
    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        hmcPage.loginTusuIlk .click() ;

    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hmcPage .emaiKutusu.sendKeys(ConfigReader .getProperty("HMCValidUsername") ) ;

    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hmcPage .passwordKutusu .sendKeys(ConfigReader .getProperty("HMCValidPassword") ) ;

    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage .loginTusu .click() ;

    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage .passwordKutusu .sendKeys(ConfigReader .getProperty("HMCWrongPassword") ) ;
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage .emaiKutusu .sendKeys(ConfigReader .getProperty("HMCWrongUsername") ) ;
    }


    @And("gecersiz {string} girer")
    public void gecersizGirer(String arg0) {
        hmcPage .emaiKutusu .sendKeys(arg0);

    }

    @And("gecersiz bir {string} girer")
    public void gecersizBirGirer(String arg0) {
        hmcPage .passwordKutusu .sendKeys(arg0 ) ;

    }
}
