Feature: Raise an inquiry for a private movement within the same town

  Scenario: Raise an inquiry successfully
    Given Anne Berger wants to move from Winarskystr. 14/20/1, 1200 Wien to Innstraße 7/1, 1210 Wien
    And wants to be contacted via telephone number +4319453933
    When she inquires support for the movement
    Then she gets a reference number back
    And the information she will get contacted within the next 24 hours