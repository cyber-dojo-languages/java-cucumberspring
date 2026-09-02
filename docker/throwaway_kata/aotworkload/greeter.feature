Feature: greeting

  Scenario: a greeter greets
    Given a greeter
    When it greets
    Then it said "hello"
