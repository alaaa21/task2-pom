package StepDefinitions;


import Pages.Proceedd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Proceed {
    WebDriver driver = null;
    Proceedd proceed = new Proceedd();
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    public void setProceed() {
        proceed.CheckBoxPOM(driver).isSelected();
proceed.btn4POM(driver).click();
    }

    public void successProceed(){
        String expectedResult = "Thank you, your order has been placed successfully\n" +
                "    You'll be redirected to Home page shortly!!";
        String url = "https://rahulshettyacademy.com/seleniumPractise/#/country";

       String actualResult = String.valueOf(driver.findElement(By.xpath("//a[@href=\"" + url + "\"]")));
        Assert.assertEquals(actualResult.concat(expectedResult), true);
    }
    @AfterTest
    public void UnSuccessProceed(){
        String expectedResult = "Please accept Terms & Conditions - Required";
        String actualResult = driver.findElement(By.className("html")).getText();
        Assert.assertEquals(actualResult.concat(expectedResult), true);
    }
}