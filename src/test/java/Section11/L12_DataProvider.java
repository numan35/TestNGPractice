package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class L12_DataProvider {

    WebDriver driver;

    @BeforeSuite
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.deriver", "D:\\d drive\\Selenium files\\drivers\\cheromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(2000);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data=new Object[3][2];
        data[0][0]="numan@test.com";
        data[0][1]="12345";
        data[1][0]="test@gmail.com";
        data[1][1]="21340";
        data[2][0]="numan@test.com";
        data[2][1]="12345";

        return data;

    }
    @Test(dataProvider = "getData")
    public void signin(String email, String password) throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("submit-login")).click();
        System.out.println("User logged in");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='logout hidden-sm-down']")).click();
    }


    @AfterSuite
    public void end() {
        driver.close();
        driver.quit();
    }



}
