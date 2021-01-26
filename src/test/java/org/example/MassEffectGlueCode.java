package org.example;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MassEffectGlueCode {
    @Given("a player of Mass Effect 3")
    public void setupME3Player(){
        throw new PendingException();
    }

    @When("they have a sample equipment load")
    public void setupSampleEquipment(){
        throw new PendingException();
    }

    @When("they have a sample character set")
    public void setupSampleCharacters() {
        throw new PendingException();
    }

    @Then("I need to be able to add an unlock for the {string}")
    public void unlockCharacterOption(String characterName){
        throw new PendingException();
    }

    @Then("I need to know how many more character unlocks I have")
    public void checkRemainingCharacterUnlocks(){
        throw new PendingException();
    }

    @Then("they need to know how many more equipment unlocks they have")
    public void checkRemainingEquipmentUnlocks(){
        throw new PendingException();
    }

    @Then("they need to be able to add an unlock for the {string}")
    public void unlockEquipmentOption(String gearName){
        throw new PendingException();
    }
}
