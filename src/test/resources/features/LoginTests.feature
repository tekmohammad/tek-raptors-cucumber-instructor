Feature: Login Functionality tests

  Scenario: Positive Test. login with valid credentials.
    When Click on Sign In Button
    And Enter username "mohammad@Tekschool.com" and password "Password@123"
    And Click on Login button
    Then Validate Account button is displayed