@tag
Feature: Google functionality
  I want to use this template for my feature file

  Scenario: Google functionality
    Given Open the Chrome and launch the Google page
    When Enter the Search text and click search button
    Then Searched page should be opend
    
  Scenario: Verify if terminal detail is being sucessfully fetched using GetAPI
		#Given I want to get a state of device and sub-devices
		Given I calls "GetStateAPI" with Get http method
		Then "id" in response is terminalName
    Then I verify the status code as "200"   
    

    
    