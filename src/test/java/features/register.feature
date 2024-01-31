
Feature: Build Verification Test
  This feature will check all the elements on the page regardless of the data

  Scenario: Getting Started
    Given I am on the Ultimate QA Registration page
    Then I see the page Registration

  Scenario: Empty fields error
    When Wait minutes 10
    And Click button Sign in
    Then I see error message "First name can't be blank" at 0
    And I see error message "Last name can't be blank" at 1
    And I see error message "Terms must be accepted" at 2
    And I see error message "Email can't be blank" at 3
    And I see error message "Password can't be blank" at 4

  Scenario: Wrapping up
    When Quit browser