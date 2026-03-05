@sanity
Feature: Creation of new Customer

  Background: 
    Given user opens the browser URL
    And user enters the username as "mngr654835"
    And user enters the password as "gagedut"
    When user clicks on login button
   # Then validate that user navigates to the homepage of the application

  Scenario Outline: Create new customer with all details
    Given user is on the homepage of the application
    And user clicks on New Customer link
    And user enters the customer name as "<cust_name>"
    And user selects gender
    And user enters date of birth as "<dob>"
    And user enters address as "<address>"
    And user enters city  as "<city>"
    And user enters state as "<state>"
    And user enters pin as "<pin>"
    And user enters mobile as "<mobile>"
    And user enters email as emailAddress
    And user enters password as "<password>"
    When user clicks on submit button
    Then a new customer will be created
    And user captures the customer id
    And user closes the browser

    Examples: 
      | cust_name | dob        | address | city    | state | pin    | mobile     | password  |
      | Tom       | 05-12-1992 | MGnagar | Kolkata | WB    | 500765 | 9832178797 | Test@1234 |
