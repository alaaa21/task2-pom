package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartt {
    public WebElement btnPOM(WebDriver driver) {

        return driver.findElement(By.xpath("//*[text()='Add To Cart']"));
    }

}
