package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class LocatorsSimple22

{
    @Test
    public void Locator () {

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
        //driver.manage().window().maximize();

        // Name
           // driver.findElement(By.name("email")).sendKeys("Sahasra@gmail.com");

        // ID - True Or Fales
          //boolean logodisplayed = driver.findElement(By.id("12975")).isDisplayed();
         //System.out.println(logodisplayed);

        // linker And Partial Text
        //driver.findElement(By.linkText("Tables")).click();
        driver.findElement(By.partialLinkText("Table")).click();

        //Class Name
        //List<webElement> headerlinks = driver.findElements(By.className("list-line-item"));
        //System.out.println("Total Number od Header links" +headerlinks.size());

        //Tag Name
        //List<webElement> links = driver.findElements(By.tagName("a"));
        //System.out.println("Total Number of links" +links.size());

        //Tag Name
        //List<webElement> Images = driver.findElements(By.tagName("Img"));
        //System.out.println("Total Number of links" +Images.size());
    }
}
