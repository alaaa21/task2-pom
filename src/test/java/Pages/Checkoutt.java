package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkoutt {

    public WebElement btn2POM(WebDriver driver) {

        return driver.findElement(By.className("//*[text()='PROCEED TO CHECKOUT']"));
    }

}
