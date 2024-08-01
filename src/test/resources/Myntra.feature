Feature: To open the Myntra page 

  Scenario: Search for a product on Mynthra
    Given I am logged into Mynthra
    When I search for Raingoat
    Then I should see search results for raingoat



