package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    private LoginPage loginPage;
    private AddToCartAndCheckout checkout;
    private EnterUserInfo checkoutDetails;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public AddToCartAndCheckout getAddToCartAndCheckout() {
        if (checkout == null) {
            checkout = new AddToCartAndCheckout(driver);
        }
        return checkout;
    }
    public EnterUserInfo getEnterUserInfo() {
        if (checkoutDetails == null) {
            checkoutDetails = new EnterUserInfo(driver);
        }
        return checkoutDetails;
    }
}