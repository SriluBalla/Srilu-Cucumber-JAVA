Feature: Build Verification Test
  Text Box

  Scenario: Getting Started
      Given Go to Base URL
      Then Verify page title DEMOQA

  Scenario Outline: Elements > Text Box
      Given I click left nav button - Text Box
      Then I see heading - Text Box
      When I type in field Full Name <Name>
      And I type in field Email <Email>
      And I type in field Current Address <CAddress>
      And I type in field Permanent Address <PAddress>
      And I click field Submit
      Then I see text for Name - <Name>
      And I see text for Email - <Email>
      And I see text for Current Address - <CAddress>
      And I see text for Permanent Address - <PAddress>
      Then Get Whole page screenshot <Name>
      Then Refresh page

     Examples:
     | Name         | Email             | CAddress                  | PAddress                      |
     | Name One     | email@one.com     | Current Address 1111111   | Permanent Address 11111       |
     | Name Two     | email@two.com     | Current Address 222222    | Permanent Address 2222222     |
     | Name Three   | email@three.com   | Current Address 3333      | Permanent Address 33333333    |


  Scenario: Elements > Radio Button
    Given I click left nav button - Radio Button
    Then I see heading - Radio Button
    And Wait seconds 2
    When I click radio button Yes
    Then I see text for radio button - Yes
    And Get Whole page screenshot rbYes
    When I click radio button Impressive
    Then I see text for radio button - Impressive
    And Get Whole page screenshot rbImpressive

  Scenario: Wrapping up
    When Quit browser