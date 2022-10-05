Feature: US1004 kullanici parametre ile configuration file i kullanabilmeli

  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi
    Given kullanici "amazonUrl" sayfasina gider
    Then kullanici 3 sn bekler
    And url' nin "amazon" icerdiğini test eder
    Then sayfayi kapatir
