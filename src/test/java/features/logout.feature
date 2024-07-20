

Feature: Test the logout functionality


  Scenario:  logout with valid email and valid password.

    Given user open website and go to login test
    When user fill email and password and click on login.
    And user should navigate home page.
    Then user logout from website