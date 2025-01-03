Feature: Application Login

  Scenario: Admin page default login
    Given USER IN ON NET BANKING PAGE
    When User login into appication with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed


  Scenario: Admin page default login
    Given USER IN ON NET BANKING PAGE
    When User login into appication with "user" and password "3435"
    Then Home Page is displayed
    And Cards are displayed


  Scenario Outline: user page default login
    Given USER IN ON NET BANKING PAGE
    When User login into appication with "<username>" and password "<password>"
    Then Home Page is displayed
    And Cards are displayed
    Examples:
      | username              |   password |
      |  DebitUserGaurav      |  hello123   |
      |  CreditUserGaurav     |  hello123   |


  Scenario: user page default sign up
    Given USER IN ON Practice PAGE
    When User login into application with
      |  Gaurav  |
      | Ahuja |
      |Gmail.com|
      |234545|
    Then Home Page is displayed
    And Cards are displayed

