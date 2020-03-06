Feature: Browse the itv homepage
  As a user I want to be directed from the homepage to the shows available on the site.

  Scenario: Visit itv.com and look at all the shows on the site.
    Given I am on itv.com
    When I click on the Show button in the header
    Then I will see all the shows available for viewing
