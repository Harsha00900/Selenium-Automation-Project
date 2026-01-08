package mavenproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productCart {

	
	
	

	

	    WebDriver driver;
	    

	    public productCart(WebDriver driver) {
	        this.driver = driver;
	        driver.switchTo().alert().accept();
	    }

	    
	    
	    // Locators
	    By backpackAddBtn = By.id("add-to-cart-sauce-labs-backpack");
	    By bikeLightAddBtn = By.id("add-to-cart-sauce-labs-bike-light");
	    By cartIcon = By.className("shopping_cart_link");

	    // Actions
	    public void addBackpackToCart() {
	        driver.findElement(backpackAddBtn).click();
	    }

	    public void addBikeLightToCart() {
	        driver.findElement(bikeLightAddBtn).click();
	    }

	    public void openCart() {
	        driver.findElement(cartIcon).click();
	    }
	}

