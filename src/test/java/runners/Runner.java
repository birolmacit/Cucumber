package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber .class )
@CucumberOptions(
        plugin={"html:target/DataTablesRaporu.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@parametre",     //ikili tag yazmak istiyosak  "@data or @guru"   gibi yazmamız gerekir
        dryRun = false
)
public class Runner {
    /*bir framework de tek bir Runner class i yeterli olabilir
    Runner class inin class body sinde hicbirsey olmaz
    Runner class ımızı onemli yapan iki adet notation vardir

  @RunWith(Cucumber .class ) notasyonu Runner Class ına calışma ozelliği katar
   bu notasyonun varlıgından dolayı Cucumber frameworkumuzde Junit kullanmayı tercih ediyoruz


   features:  Runner dosyasinin feature dosyalarını nereden bulacagını tarif eder
   glue: stepdefinitions dosyalarini nerede bulacagımızı gosterir
   tagg: o an hangi tag i calıstırmak istedıgımızı belli ederiz

   dryRun: iki secenek var

   dryRun=true; yazdıgımızda testımızı calıstırmadan sadece eksık adımları bize verir
   dryRun=false; testlerimizi direkt calistirir
     */


}
