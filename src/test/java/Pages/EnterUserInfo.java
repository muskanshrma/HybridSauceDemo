package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class EnterUserInfo {

        WebDriver driver;
        public static Properties prop;
        By firstName = By.xpath("//input[@name='firstName']");
        By lastName = By.xpath("//input[@name='lastName']");
        By zip = By.xpath("//input[@name='postalCode']");
        By continueButton = By.xpath("//input[@name='continue']");
        By finishButton = By.xpath("//button[@name='finish']");
        By verify = By.xpath("//h2[@class='complete-header']");

        public EnterUserInfo(WebDriver driver) {
            this.driver = driver;
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        public void checkoutDetails() {
            try {
                prop = new Properties();
                FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//TestData//recources.properties");
                prop.load(input);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            driver.findElement(firstName).sendKeys(prop.getProperty("fName"));
            driver.findElement(lastName).sendKeys(prop.getProperty("lName"));
            driver.findElement(zip).sendKeys(prop.getProperty("zipCode"));
            driver.findElement(continueButton).click();
            driver.findElement(finishButton).click();
        }
    public void verifyCheckout(){
        String actual = driver.findElement(verify).getText();
        Assert.assertEquals(actual, "THANK YOU FOR YOUR ORDER", "Expected result does not match with actual result");
    }
}