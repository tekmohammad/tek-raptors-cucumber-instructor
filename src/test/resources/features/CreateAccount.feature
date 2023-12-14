@Regression @Create_Account
Feature: Create Account functionality test

  Background: Setup test for create account
    When Click on Sign In Button
    When Click on Create New Account button

  @Create_New_Account
  Scenario: Create valid new account
    When Fill Create Account form "Mohammad" "random@gmail.com" "Password@123"
    When Click on sign up button
    Then Validate account create with "Mohammad"

  @Additional_story
  Scenario: Created Account with Existing email and validate error
    When Fill Create Account form "Mohammad" "mohammad@gmail.com" "Password@123"
    When Click on sign up button
    Then Validate error message "this email is already exist, please use another email address"

  @Create_account_datatable
  Scenario: Created Account with Existing email and validate error with Data Table
    When Fill up account form with DataTable
      | name     | Mohammad           |
      | email    | mohammad@gmail.com |
      | password | Password@123       |
    When Click on sign up button
    Then Validate error message "this email is already exist, please use another email address"

  @Create_account_datatable_2
  Scenario: Created Account with Existing email and validate error with Data Table
    When Fill up account form with list data table
      | Murtaza            |
      | mohammad@gmail.com |
      | NewPassword@123    |
    When Click on sign up button
    Then Validate error message "this email is already exist, please use another email address"