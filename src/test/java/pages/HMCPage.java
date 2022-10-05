package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {
    public HMCPage (){
        PageFactory .initElements(Driver .getDriver() ,this ) ;
    }
    @FindBy(xpath = "//*[@id=\"navLogon\"]/a")
    public WebElement loginTusuIlk;
    @FindBy(xpath = "//*[@id=\"UserName\"]")
    public WebElement emaiKutusu;
    @FindBy(xpath = "//*[@id=\"Password\"]")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//*[@id=\"btnSubmit\"]")
    public WebElement loginTusu;
}
