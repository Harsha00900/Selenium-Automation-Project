package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By removeBackpackBtn = By.id("remove-sauce-labs-backpack");
    By checkoutBtn = By.id("checkout");

    // Actions
    public void removeBackpack() {
        driver.findElement(removeBackpackBtn).click();
    }

    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }
}
