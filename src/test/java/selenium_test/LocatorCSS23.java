package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorCSS23
{
    @Test
    public void LocatorCSS ()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");

        // Tag ID
        driver.findElement(By.cssSelector("input#small-searchterm")).sendKeys("T-shirts");
        driver.findElement(By.cssSelector("#small-searchterm")).sendKeys("T-shirts");

        //Tag Class
        driver.findElement(By.cssSelector(".searchbox-text")).sendKeys("T-shirts");

        //Tag Attribute
        driver.findElement(By.cssSelector("input[placeholder ='sahasra']")).sendKeys("T-shirt");
        driver.findElement(By.cssSelector("[placeholder ='sahasra']")).sendKeys("T-shirt");

        // Tag ClassName[Attribute='sahas']
        driver.findElement(By.cssSelector("input.search[name='sahas']")).sendKeys("T-shairts");
        driver.findElement(By.cssSelector(".search[name='sahas']")).sendKeys("T-shairts");


    }



}
