

Feature: Test the login functionality


  Scenario: To login with valid email and valid password.

    Given user open website and go to login test.
    When user fill email and password and click on login.
    Then  user should navigate to home page.


  Scenario: To login with invalid email and invalid password.

    Given user open website and go to login test.
    When user fill email and password invalid and click on login.
    Then is error


  Scenario: To login with valid email  and invalid password contain many number

    Given user open website and go to login test.
    When user fill email and password invalid contain many number.
    Then is error


  Scenario: To login with valid email  and invalid password contain one number or character

    Given user open website and go to login test.
    When user fill email and password invalid contain one number or character
    Then is error