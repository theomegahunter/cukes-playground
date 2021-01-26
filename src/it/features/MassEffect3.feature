@ignore
Feature: Mass Effect 3

Scenario: Equipment Counter
  Given a player of Mass Effect 3
  When they have a sample equipment load
  Then they need to know how many more equipment unlocks they have

Scenario: Equipment Updates
  Given a player of Mass Effect 3
  When they have a sample equipment load
  Then they need to be able to add an unlock for the "Kishock Sniper Rifle"

Scenario: Character Updates
  Given a player of Mass Effect 3
  When they have a sample character set
  Then I need to be able to add an unlock for the "Turian Havok"

Scenario: Character Counter
  Given a player of Mass Effect 3
  When they have a sample character set
  Then I need to know how many more character unlocks I have