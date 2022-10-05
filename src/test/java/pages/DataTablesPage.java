package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {
    public DataTablesPage(){
        PageFactory .initElements(Driver .getDriver() ,this );
    }

    @FindBy (xpath = "//*[@id=\"example_wrapper\"]/div[1]/button[1]/span")
    public WebElement newButonu;
    @FindBy (xpath = "//*[@id=\"DTE_Field_first_name\"]")
    public WebElement firstname;
    @FindBy (xpath = "//*[@id=\"DTE_Field_last_name\"]")
    public WebElement lastname;
    @FindBy (xpath = "//*[@id=\"DTE_Field_position\"]")
    public WebElement position;
    @FindBy (xpath = "//*[@id=\"DTE_Field_office\"]")
    public WebElement office;

    @FindBy (xpath = "//*[@id=\"DTE_Field_extn\"]")
    public WebElement extention;

    @FindBy (xpath = "//*[@id=\"DTE_Field_start_date\"]")
    public WebElement startdate;

    @FindBy (xpath = "//*[@id=\"DTE_Field_salary\"]")
    public WebElement salary;

    @FindBy (xpath = "/html/body/div[9]/div/div/div/div[1]/div[4]/div[3]/button")
    public WebElement createtusu;


}
