Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre

  Scenario: TC06 kullanici parametre kullanarak amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "nutella" icin arama yapar
    And sonuclarin "nutella" icerdigini test eder
