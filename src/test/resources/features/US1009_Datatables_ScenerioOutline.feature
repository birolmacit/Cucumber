@data
Feature: US1009 datatables

  Scenario Outline: TC14 datatables


    Given kullanici "datatablesUrl" sayfasina gider
    Then kullanici datatablesUrl new butonuna tiklar
    And yeni isim "<firstname>" girer
    And yeni bir soyisim "<lastname>" girer
    And yeni bir pozisyon "<position>" girer
    And yeni bir office "<office>" girer
    And yeni extention "<extention>" girer
    And yeni tarih girer

    And yeni salary "<salary>" girer
    And create tusuna basar
    And sayfayi kapatir


    Examples:
      |firstname|lastname|position|office|extention|salary|
      |Manager5|Manager5|ogretmen|istanbul|abc|100000|
      |Manager6|Manager6|ogretmen|istanbul|abc|100000|
