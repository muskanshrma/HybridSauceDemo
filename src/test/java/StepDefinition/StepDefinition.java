package StepDefinition;

import Pages.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;


public class StepDefinition extends BaseClass {

    @Given("user is on login page")
    public void addToCart() throws IOException {
        pageFactory.getLoginPage().login();
    }

    @When("User enter {string} and {string}")
    public void userEnterAnd(String userName, String password) {
        System.out.println("I am here");
    }
}