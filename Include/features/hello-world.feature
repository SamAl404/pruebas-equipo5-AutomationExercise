Feature: BDD environment verification

	Scenario: The BDD environment is operational
		Given a working BDD setup
		When the engine processes this scenario
		Then the scenario pases succesfully
		