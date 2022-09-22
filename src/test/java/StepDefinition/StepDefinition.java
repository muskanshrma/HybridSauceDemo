package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class StepDefinition extends BaseClass {

    @Given("User enter username and password and clicks on login button")
    public void login() throws IOException {
        setup("chrome");
        pageFactory.getLoginPage().login();
    }

    @When("user adds item to cart and clicks on checkout button")
    public void checkoutCart() {
        pageFactory.getAddToCartAndCheckout().addToCart();
    }

    @And("User enters details")
    public void userDetails() {
    pageFactory.getEnterUserInfo().checkoutDetails();
    }

    @Then("Order is placed")
    public void user_is_on_inventory_page() {
        pageFactory.getEnterUserInfo().verifyCheckout();
    }
}