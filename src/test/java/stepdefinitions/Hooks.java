package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /* Cucumber da StepDefinitions package i icerisinde
    @before @after gibi bir notasyon varsa  extends testBase
    dememize gerek kalmadan her scenerio dan once veya sonra bu method calısacaktır
     bu da bizim istedigimiz bir durum degıldır


      Cucumber da @before @after kullanma ihtiyacımız olursa bunu
      step definitions package i altında olusturacagımız hooks class ına koyarız

      biz her senarodan sonra test sonucunu kontrol edip fail olan senaryolar icin screenshot alması amacıyla
      @after method u kullanıcaz
       */
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}
