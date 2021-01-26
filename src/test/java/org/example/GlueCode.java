package org.example;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class GlueCode {
    int bananaPrice = -1;

    Checkout checkout;

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws PendingException {
        bananaPrice = price;
    }

    @When("I checkout {int} {string}")
    public void iCheckout(int itemCount, String itemName) throws PendingException {
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws PendingException {
        assertEquals(total, checkout.total());
    }
}
