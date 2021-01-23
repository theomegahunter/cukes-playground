package org.example;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GlueCode {
    int bananaPrice = -1;

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws PendingException {
        bananaPrice = price;
    }

    @When("^I checkout {int} {string}$")
    public void iCheckout(int arg1, String arg2) throws PendingException {
        throw new PendingException();
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int arg1) throws PendingException {
        throw new PendingException();
    }
}
