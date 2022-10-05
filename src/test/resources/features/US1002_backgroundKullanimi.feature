Feature: US1002 Kullanici ortak adimlari background ile calistirir

  Background:
    Given kullanici amazon anasayfasinda

    Scenario: TC04 amazon nutella arama
      And kullanici nutella icin arama yapar
      Then sonuclarin nutella icerdigini test eder
      Then sayfayi kapatir


  Scenario: TC05 kullanici java kelimesi aratir

    Then kullanici java icin arama yapar
    And sonuclarin java icerdigini test eder
    And sayfayi kapatir