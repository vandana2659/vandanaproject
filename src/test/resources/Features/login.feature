@Smokescenario
Feature: feature to test login functionality

  @smoketest
  Scenario: Check user is able to withdraw the amount as a customer
    Given user is on Login page
    When user clicks on on the Customer Login and selects the <name>
    And user clicks on the login button
    Then click on the withdrawl button and logout

    Examples
    |name|
    
    |harry potter|
    
    @bankmanger
    Scenario: check bank manager is able to see the withdrawl
    Given user is on Login page
    When user clicks on on the bankmanger and selects the search <name> 
    And banknamager add the customer <firstname> and <lastname> and <postalcode>
    
    Examples
    |name|
    
    |harry potter|
    
    |firstname|  |lastname| |postalcode|
    
    |vandu| |reddy| |p43256|
    
    
    
    
    
    
    
    