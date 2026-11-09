package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsXpath24
{
    @Test
    public void LocatorXpath ()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");

    // Xpath with single attribute
        driver.findElement(By.xpath("input xpath using selectorhub")).sendKeys("T-shirts");

        // Xpath with multiple attribute
        driver.findElement(By.xpath("input xpath using selectorhub muliple xpath using own")).sendKeys("T-shirts");

        // Xpath with And Operators
        driver.findElement(By.xpath("input xpath using selectorhub muliple xpath using own")).sendKeys("T-shirts");

        // Xpath wit Or Operator
        driver.findElement(By.xpath("input xpath using selectorhub muliple xpath using own")).sendKeys("T-shirts");

        //Xpath with text() - inner text
        driver.findElement(By.xpath("//*[text()='macbook']")).click();
        driver.findElement(By.xpath("//input[text()='macbook']")).click();

        //Xapth (Header)
        boolean displaystatus = driver.findElement(By.xpath("//input[text()='macbook']")).isDisplayed();
        System.out.println(displaystatus);  // true

        String value = driver.findElement(By.xpath("//input[text()='macbook']")).getText();
        System.out.println(value); // Features





    }

}
