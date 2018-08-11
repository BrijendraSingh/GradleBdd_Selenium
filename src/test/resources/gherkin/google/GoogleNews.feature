@sampleTag
Feature: sample feature for google news

Scenario: sample scenario to read google news
	Given user navigate to google news
	When user search the keyword "brijendra singh"
	Then user list down all the news
