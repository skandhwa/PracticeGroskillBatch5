@sanity

Feature: Login Functionality for Demo Guru 99

  Scenario Outline: Validate Login Functionality
    Given user opens the browser URL
    And user enters the username as "<uname>"
    And user enters the password as "<password>"
    When user clicks on login button
    Then validate that user navigates to the homepage of the application
    And user closes the browser

    Examples: 
      | uname      | password |
      | mngr654835 | gagedut  |
