package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DataTablesPage;
import utilities.Driver;

import javax.swing.*;

public class DataStepDef {
    DataTablesPage dataTablesPage = new DataTablesPage();
    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablesPage .newButonu .click() ;
    }

    @Given("kullanici datatablesUr sayfasina gider")
    public void kullaniciDatatablesUrSayfasinaGider() {
        Driver .getDriver() .get("https://editor.datatables.net/") ;
    }

    @Then("kullanici datatablesUrl new butonuna tiklar")
    public void kullaniciDatatablesUrlNewButonunaTiklar() {
        dataTablesPage .newButonu .click() ;
    }

    @And("yeni isim {string} girer")
    public void yeniIsimGirer(String isim) {
        dataTablesPage .firstname .sendKeys(isim );
    }

    @And("yeni bir soyisim {string} girer")
    public void yeniBirSoyisimGirer(String lastname) {
        dataTablesPage .lastname .sendKeys(lastname );
    }

    @And("yeni bir pozisyon {string} girer")
    public void yeniBirPozisyonGirer(String position) {
        dataTablesPage .position .sendKeys(position );
    }

    @And("yeni bir office {string} girer")
    public void yeniBirOfficeGirer(String office) {
        dataTablesPage .office .sendKeys(office );
    }

    @And("yeni extention {string} girer")
    public void yeniExtentionGirer(String extention) {
        dataTablesPage .extention .sendKeys(extention );
    }

    @And("yeni tarih girer")
    public void yeniTarihGirer() {
        dataTablesPage .startdate .sendKeys("2022-10-04") ;
    }

    @And("yeni salary {string} girer")
    public void yeniSalaryGirer(String salary) {
        dataTablesPage .salary .sendKeys(salary ); 
    }

    @And("create tusuna basar")
    public void createTusunaBasar() {
        dataTablesPage .createtusu .click() ;
    }
}
