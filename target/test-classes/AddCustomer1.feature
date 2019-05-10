@reg
Feature: Title of your feature
  I want to use this template for my feature file

 @smoke1
  Scenario Outline: Title of your scenario outline
     Given The user is in telecom pages
    And The user navigates to add customer detail
    When The user fill in the forms1"<fname>","<lname>","<email>","<address>","<telephone>"
    And The user submits the forms
    Then The customer should verify the id is generated

    Examples: 
    |fname|lname|email|address|telephone|
    |text|abcde|kr@gmail.com|tanjore|8967|
    |text1|bcdef|ar@gmail.com|nil    |6789|
    |text2|cbdfr|vr@gmail.com|nil    |1234|
    |text3|dhjyr|sr@gmail.com|nil    |7865|
