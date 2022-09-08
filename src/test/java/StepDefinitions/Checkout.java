package StepDefinitions;


import Pages.Checkoutt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Checkout {
   WebDriver driver = null;
    Checkoutt check = new Checkoutt();
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    public void setCheck(){
      check.btn2POM(driver).click();
    }

    public void successCheck(){
        String expectedResult = "https://rahulshettyacademy.com/seleniumPractise/#/cart";
        String actualResult = driver.findElement(By.className("html")).getText();
        Assert.assertEquals(actualResult.concat(expectedResult), true);
    }
}
