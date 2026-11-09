package handling_dropdown31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Drop_Down
{
    @Test
    public static void main (String[] arge)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dropCountryEle = driver.findElement(By.xpath("//select[@id='country']"));  // Not directly access this object
        Select dropCountry = new Select(dropCountryEle);       // Inside have many webelements

        // select option from thr drop down----------------------------------------


        dropCountry.selectByVisibleText("Frnce");
        dropCountry.selectByValue("Japan");
        dropCountry.selectByIndex(3);

        // Capture the options fropm the dropdown

        List<WebElement> options = dropCountry.getOptions();
        System.out.println("Number of options in a dropdown"+options.size());

        //Print the option
        for (int i=0;i<options.size(); i++)
        {
            System.out.println(options.get(i).getText());
        }

        // Enhance For Loop

        for (WebElement op:options)
        {
            System.out.println(op.getText());
        }

    }


}
