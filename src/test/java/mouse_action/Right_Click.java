package mouse_action35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Right_Click
{ @Test
  public static void main(String[] arge)
  {
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
      driver.manage().window().maximize();

      WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
      Actions act = new Actions(driver);

      // Right click action----------------------------------------
      act.contextClick(button).perform();

     // Click on copy-----------------------------------------------
      driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

      //Thread.sleep(5000);

      // Close alert box-----------------------------------------------------
      driver.switchTo().alert().accept();
  }
}
