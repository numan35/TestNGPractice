package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L14_Enabled {

    WebDriver driver;

    @BeforeSuite
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.deriver", "D:\\d drive\\Selenium files\\drivers\\cheromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");

        Thread.sleep(2000);
    }

    @Test
    public void enterEmail() throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys("numan@test.com");
        Thread.sleep(2000);
    }

    @Test(enabled = false)
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.name("password")).sendKeys("12345");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = {"enterEmail", "enterPassword"})
    public void clickButton() throws InterruptedException {
        driver.findElement(By.id("submit-login")).click();
        Thread.sleep(2000);
    }


}
