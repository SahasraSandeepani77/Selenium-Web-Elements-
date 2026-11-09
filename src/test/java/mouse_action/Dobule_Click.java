package mouse_action35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dobule_Click
{
        @Test
        public static void main(String[] arge)
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
            driver.manage().window().maximize();

            // Switch to frame----------------------------------------
            driver.switchTo().frame("iframeResult");

            WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
            WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
            WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

            box1.clear(); // clears box1
            box1.sendKeys("WELCOME");

            // Double click action on the button
            Actions act = new Actions(driver);
            act.doubleClick(button).perform();

            // Validation: box2 should contain "WELCOME"--------------------------------

            //String text = box2.getText(); // This method cant use

            String text = box2.getAttribute("value"); // Describe this book
            System.out.println("Captured value is: " + text);

            if (text.equals("WELCOME")) {
                System.out.println("Text copied successfully...");
            } else {
                System.out.println("Text not copied...");
            }


        }
}