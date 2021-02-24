Feature: Login feature

  @librarian
  Scenario: Login in as librarian
    Given I am on the login page
    When I login as a librarian
    Then Dashboard should be displayed

  @student
  Scenario: Login in as student
    Given I am on the login page
    When I login as a student
    Then Book should be displayed