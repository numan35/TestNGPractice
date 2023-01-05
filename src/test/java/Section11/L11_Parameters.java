package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class L11_Parameters {

    WebDriver driver;

    @BeforeSuite
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.deriver", "D:\\d drive\\Selenium files\\drivers\\cheromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(2000);
    }

    @Parameters({"email", "password"})
    @Test
    public void signin(String email, String password){
        driver.get("http://teststore.automationtesting.co.uk/");
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("submit-login")).click();
        System.out.println("User logged in");
    }
    @Test
    public void test() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@id='category-3']//a[@class='dropdown-item']")).click();
        driver.findElement(By.xpath("//a[@class='logout hidden-sm-down']")).click();


    }

    @AfterSuite
    public void end() {
        driver.close();
        driver.quit();
    }

}
