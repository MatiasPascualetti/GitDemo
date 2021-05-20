
Feature: Application Login
  I want to login to the application

  @SanityTest
  Scenario: Home page default login
    Given User is on the NetBanking landing page
    When User login to the app with "User" and password "1234"
    Then Home page displayed "true"
    And Cards displayed "true"
    
      @MobileTest
  Scenario: Home page default login
    Given User is on the NetBanking landing page
    When User login to the app with "User" and password "1234"
    Then Home page displayed "true"
    And Cards displayed "true"
    
    