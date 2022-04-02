@Search
Feature: search product
  Scenario Outline: search products
    Given user is on the home page
    And user login to account
    And user should login successfully
    When user selects "<category>" from categories
    And user search for "<keyword>"
    Then verify search results contain "<keyword>"
    And close the browser

    Examples: credentials
      | category  | keyword     |
      | Computers | macbook     |
#      | Books     | Jules Verne |
