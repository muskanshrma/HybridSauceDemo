package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddToCartAndCheckout {

    WebDriver driver;

    By addToCart = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    By cartButton = By.xpath("//a[@class='shopping_cart_link']");
    By checkoutButton = By.xpath("//button[@name='checkout']");

    public AddToCartAndCheckout(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addToCart() {

        driver.findElement(addToCart).click();
        driver.findElement(cartButton).click();
        driver.findElement(checkoutButton).click();
    }
}