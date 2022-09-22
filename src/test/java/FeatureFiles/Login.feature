Feature: Login and product checkout

  Scenario: Successful Login with Valid Credentials and Add item to cart and checkout
    Given User enter username and password and clicks on login button
    When user adds item to cart and clicks on checkout button
    And User enters details
    Then Order is placed
