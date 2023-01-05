package Section11;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L8_Annotation_Pt1 {


    WebDriver driver;

    @BeforeSuite
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.deriver", "D:\\d drive\\Selenium files\\drivers\\cheromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }



    @Test
    public void test() {
        driver.get("https://www.automationtesting.co.uk");

    }

    @AfterSuite
    public void end() {
        driver.quit();
    }


}


