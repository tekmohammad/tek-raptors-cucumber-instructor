@Regression
Feature: Create Account functionality test

  Scenario: Create valid new account
    When Click on Sign In Button
    When Click on Create New Account button
    When Fill Create Account form "Mohammad" "mohammad@gmail.com" "Password@123"
    When Click on sign up button
    Then Validate account create with "Mohammad"