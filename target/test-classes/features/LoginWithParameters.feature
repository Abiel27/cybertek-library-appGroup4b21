Feature: Login with parameters

  @librarianParam
    Scenario: Login as librarian 43
      Given  I am on the login page
      When I entered username "librarian19@library"
      And  I enter password '6M0J2Wr7'
      And And click the sigh in button
    And there should be 2841 users
    Then Dashboard should be displayed

    @studentParam
  Scenario: Login as student 29
    Given  I am on the login page
    When I entered username "student29@library"
    And  I enter password 'WyIUNpDI'
    And And click the sigh in button
    Then Book should be displayed


  Scenario: Login as librarian 29
    Given  I am on the login page
    When I login using "librarian19@library" and '6M0J2Wr7'
    Then Dashboard should be displayed