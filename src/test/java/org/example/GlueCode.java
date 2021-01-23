package org.example;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
public class GlueCode {

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String arg1, int arg2) throws Throwable {
        throw new PendingException();
    }

    @When("^I checkout(\\d+)\"(.*?)\"$")
    public void iCheckout(int arg1, String arg2) throws Throwable {
        throw new PendingException();
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int arg1) throws Throwable {
        throw new PendingException();
    }
}
