package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Proceedd {
    public Select btn3POM(WebDriver driver){
        Select country = new Select(driver.findElement(By.className("wrapperTwo")));
        country.selectByVisibleText("Egypt");
        return country;
    }
    public WebElement CheckBoxPOM(WebDriver driver){
        WebElement checkbox = driver.findElement(By.className("chkAgree"));
        boolean isSelected = checkbox.isSelected();

        if (isSelected == true) {
            checkbox.click();


        }

        return checkbox ;
    }

        public WebElement btn4POM(WebDriver driver) {

            return driver.findElement(By.className("//*[text()='Proceed']"));
        }
    }


