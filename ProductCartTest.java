package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import mavenproject.LoginPage;
import mavenproject.CartPage;

public class ProductCartTest {

    WebDriver driver;
    LoginPage loginPage;
    productCart productsPage;
    CartPage cartPage;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);
        productsPage = new productCart(driver);
        cartPage = new CartPage(driver);

        // Login
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Test
    public void addProductAndRemoveFromCart() {
        productsPage.addBackpackToCart();
        productsPage.addBikeLightToCart();
        productsPage.openCart();

        cartPage.removeBackpack();   // remove one product
        // cartPage.clickCheckout(); // optional
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
