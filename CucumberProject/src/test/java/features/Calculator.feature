Feature: To test the Calculator functionality

  Background: 
    Given I have the calculator

  Scenario: Verify the addition of two numbers using calculator
    When I add two numbers 10 and 20
    Then I should get the result as 30

  Scenario: Verify the substraction of two numbers using calculator
    When I substract two numbers 10 and 5
    Then I should get the result as 5

  Scenario Outline: Verify the additon of two number using calculator with multiple data
    When I add two numbers <num1> and <num2>
    Then I should get the result as <result>

    Examples: 
      | num1 | num2 | result |
      |    5 |    6 |     11 |
      |   10 |   12 |     22 |
      |   -8 |    5 |     -3 |

  Scenario: Verify the addition of multiple numbers
    When I add the below numbers
      |  4 |
      |  6 |
      | 10 |
      | 22 |
      | 10 |
    Then I should get the result as 52

  Scenario: To calculate the total bill of all the items
    When I buy the below item at given price
      | icecream | 20 |
      | cake     | 30 |
      | pencil   | 50 |
    Then I should get the result as 100

  Scenario: To calculate the total bill of all the items with different quantity
    When I buy the below items at given price and at given quantity
      | coffee   | 2 |  50 |
      | icecream | 1 | 100 |
      | sugar    | 5 |  10 |
    Then I should get the result as 250
