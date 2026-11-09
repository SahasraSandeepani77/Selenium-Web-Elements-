package handling_dropdown31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Hidden_Dropdown {

    @Test
    public static void main(String[] arge) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Login steps



        //Clicking on PIM
        driver.findElement(By.xpath("")).click();

        //Clicked on dropdown
        driver.findElement(By.xpath("")).click();
       // Thread.sleep(5000);

        //Select Singal option
        driver.findElement(By.xpath("")).click();

        //Count number of options
        List<WebElement> optins = driver.findElements(By.xpath(""));
        System.out.println("Number of Options"+optins.size());

        //Printing Option
        for (WebElement op:optins)
        {
            System.out.println(op.getText());
        }
    }
}