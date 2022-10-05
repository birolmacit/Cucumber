
@all
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar
@nutella @ikisi
  Scenario: TC01 kullanici amazon kelimesi aratir

    Given kullanici amazon anasayfasinda
    Then kullanici nutella icin arama yapar
    And sonuclarin nutella icerdigini test eder

    And sayfayi kapatir


@java @ikisi
  Scenario: TC01 kullanici java kelimesi aratir

    Given kullanici amazon anasayfasinda
    Then kullanici java icin arama yapar
    And sonuclarin java icerdigini test eder
    And sayfayi kapatir