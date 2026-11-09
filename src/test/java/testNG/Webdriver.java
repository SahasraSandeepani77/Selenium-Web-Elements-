package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Webdriver
{

    WebDriver driver;

    @Test (priority = 1)
    void openapp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("");
        driver.manage().window().maximize();

    }

    @Test(priority = 2)
    void testlogo() throws InterruptedException {
       Thread.sleep(3000);
        boolean status = driver.findElement(By.xpath("")).isDisplayed();
        System.out.println("logo displayed..."+status);
    }

    @Test(priority = 3)
    void testlogin()
    {
        driver.findElement(By.xpath("")).sendKeys("Admin");
        driver.findElement(By.xpath("")).sendKeys("admin123");
        driver.findElement(By.xpath("")).click();
    }

    @Test(priority = 4)
    void closeapp()
    {
       // driver.quit();
    }

}
