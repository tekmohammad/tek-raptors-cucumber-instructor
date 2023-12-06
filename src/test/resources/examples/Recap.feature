Feature: Searching in Google

  Scenario: Search something in google
    Given Open chrome browser
    Given navigate to google
    When type "What time it is" in search box and click search
    Then Google shows the result
    Then close browser

    