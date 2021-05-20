
Feature: Application Login
  I want to login to the application

  @RegTest
  Scenario: Home page default login
    Given User is on the NetBanking landing page
    When User login to the app with "User" and password "1234"
    Then Home page displayed "true"
    And Cards displayed "true"
    
 @SmokeTest   
 Scenario: Home page default login negative
    Given User is on the NetBanking landing page
    When User login into the app with "Wrong" and password "1234"
    Then Home page displayed "false"
    And Cards displayed "false"
    
 @RegTest
 Scenario Outline: Home page default login multiple inputs
    Given User is on the NetBanking landing page
    When User login to the app with <username> and <password>
    Then Home page displayed "true"
    And Cards displayed "true"
    
    Examples:
    |username|password|
    |mark    |1234    |
    |carl    |123     |
    |emma    |4321    |
    |lina    |5895    |
    |Martin  |888888  |
    |Tito    |0303456 |
    