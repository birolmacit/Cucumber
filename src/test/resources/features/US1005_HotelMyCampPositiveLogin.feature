@hmc
Feature: US1005 dogru kullanici adi ve sifre ile giris yapabilmeli
  Scenario: TC08 positive login test
    Given kullanici "HMCUrl" sayfasina gider
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    And kullanici 5 sn bekler
    And sayfayi kapatir