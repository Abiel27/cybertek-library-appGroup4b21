Feature: Search functionality on the users page
  As a user, when I login as a librarian and I go to Users page, then table should have following
  . Action
  . UserID
  . FullName
  . Email
  . Group
  . Status

  @wip
  Scenario: Table columns names
    Given I am on the login page
    When I login as a librarian
    And  I click on "Users" link
    Then Table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |





