Feature: the version of the application can be retrieved
  Scenario: version can be retrieved
    When the application is asked for the version
    Then the build version is shown as version