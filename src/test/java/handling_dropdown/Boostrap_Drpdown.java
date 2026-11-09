package handling_dropdown31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Boostrap_Drpdown {
    @Test
    public static void main(String[] arge) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 1) Select singal option
        driver.findElement(By.xpath("")).click();

        // 2) Capture all the options and find out size
        List<WebElement>options = driver.findElements(By.xpath(""));
        System.out.println("Number of options"+options.size()); //14

        // 3) Printing options from dropdown
        for (WebElement op:options)
        {
            System.out.println(op.getText());
        }

        // 4) Select multiple options
        for (WebElement op:options)
        {
           String option = op.getText();
           //if(op.getText().equals("Java")) || op.getText().equals("SQL") || op.getText()..equals("c++"))
           if(option.equals("Java")|| option.equals("SQL") || option.equals("c++"))
            {
                op.click();
            }
            

        }
    }
}