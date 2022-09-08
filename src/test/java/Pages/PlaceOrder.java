package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceOrder {
    public WebElement btn3POM(WebDriver driver) {

        return driver.findElement(By.className("//*[text()='Place Order']"));
    }
}
