Feature: Searching in Google

  Scenario Outline: Search something in google
    Given Open chrome browser
    Given navigate to google
    When type "<searchText>" in search box and click search
    Then Google shows the result
    Then close browser
    Examples:
      | searchText            |
      | What time it is       |
      | Tekschool             |
      | How far from VA to CA |
      | How far to Moon       |

    