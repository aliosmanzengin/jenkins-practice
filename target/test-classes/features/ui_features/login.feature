@Login
  Feature: Login Feature
    @loginpositive
    Scenario: logging in to amazon
      Given user is on the home page
      And user login to account
      Then user should login successfully
