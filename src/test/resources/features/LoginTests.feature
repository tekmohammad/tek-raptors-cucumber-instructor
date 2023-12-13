@Smoke @Regression
Feature: Login Functionality tests

  Background: Test setup navigate to sign in page.
    When Click on Sign In Button


  Scenario: Positive Test. login with valid credentials.
    And Enter username "mohammad@Tekschool.com" and password "Password@123"
    And Click on Login button
    Then Validate Account button is displayed

  Scenario Outline: Negative Test. Validate invalid username
    And Enter username "<username>" and password "<password>"
    And Click on Login button
    Then Validate error message "<errorMessage>"
    Examples:
      | username                    | password      | errorMessage               |
      | wrongusername@Tekschool.com | Password@123  | wrong username or password |
      | mohammad@Tekschool.com      | wrongPass@123 | wrong username or password |
      | wrongusername@Tekschool.com | wrongPass@123 | wrong username or password |