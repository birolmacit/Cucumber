Feature: US1008 kullanici farkli yanlis sifre ve kullanici adi ile giris yapamaz

  Scenario Outline: TC13 yanlis kullanici adi ve sifrelerle giris yapilamaz

    Given kullanici "HMCUrl" sayfasina gider
    Then Log in yazisina tiklar
    And gecersiz "<username>" girer
    And gecersiz bir "<password>" girer
    And Login butonuna basar
    And kullanici 2 sn bekler
    And sayfayi kapatir


    Examples:
    |username|password|
    |Manager5|Manager5|
    |Manager6|Manager6|


