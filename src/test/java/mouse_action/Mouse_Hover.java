package mouse_action35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class Mouse_Hover {
    @Test
    public static void main(String[] arge) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Google Browser------------------
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();

        WebElement Desktop = driver.findElement(By.xpath(""));
        WebElement Macbook = driver.findElement(By.xpath(""));

        //Mouse over action
        Actions act = new Actions(driver);
        //act.moveToElement(Desktop).moveToElement(Macbook).click().build().perform();
        act.moveToElement(Desktop).moveToElement(Macbook).perform();
    }
}
