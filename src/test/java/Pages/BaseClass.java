package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
    public static PageFactory pageFactory;
    static WebDriver driver;

    @Parameters("browserName")
    @BeforeClass
    public static void setup(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = WebDriverManager.chromedriver().create();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.saucedemo.com/");
            pageFactory = new PageFactory(driver);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = WebDriverManager.firefoxdriver().create();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.saucedemo.com/");
            pageFactory = new PageFactory(driver);
        }
    }

    @AfterClass
    public static void close() {
        driver.close();
    }
}