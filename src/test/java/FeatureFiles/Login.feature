Feature: Login

  Scenario Outline: Successful Login with Valid Credentials
    Given user is on login page
    When User enter "<username>" and "<password>"

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |