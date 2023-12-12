Feature: Home Page Validation

  Scenario: Validate home page title.
    Given open browser and navigate to retail app
    Then Validate Title on top left corner
    Then quit browser

    #Navigate to retail app and make sure Sign in button is enabled.
  Scenario: Validate sign in button is enabled.
    Given open browser and navigate to retail app
    Then Validate sign in button is enabled
    Then quit browser