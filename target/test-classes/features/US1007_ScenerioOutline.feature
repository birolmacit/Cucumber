#amazon sayfasına gidip sırasıyla nutella java elma armut aratıp
  #sonucların arama yaptıgımız kelimeyi icerdiği test edilir

Feature:US1007 kullanıcı amazonda istediği kelimeleri aratır
  Scenario Outline : TC12 amazonda listedeki elementleri aratma
    Given kullanici "amazonUrl" sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelime>" icerdigini test eder
    And sayfayi kapatir


    Examples:
    |istenenKelime|
    |nutella|
    |java|
    |elma|
    |armut|

