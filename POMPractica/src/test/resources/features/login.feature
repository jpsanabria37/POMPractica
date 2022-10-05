Feature: Login
  As a SwagLabs user, I would like to be able to
  log in to the platform to view the products.

  Scenario: successful login
    Given I find myself on the swaglabs home page.
    When entering the correct credentials
    Then I must be able to see the products