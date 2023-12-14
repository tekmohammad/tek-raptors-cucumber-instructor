@Regression @Create_Account
Feature: Create Account functionality test

  Background: Setup test for create account
    When Click on Sign In Button
    When Click on Create New Account button

  Scenario: Create valid new account
    When Fill Create Account form "Mohammad" "random@gmail.com" "Password@123"
    When Click on sign up button
    Then Validate account create with "Mohammad"

  @Additional_story
  Scenario: Created Account with Existing email and validate error
    When Fill Create Account form "Mohammad" "mohammad@gmail.com" "Password@123"
    When Click on sign up button
    Then Validate error message "this email is already exist, please use another email address"
