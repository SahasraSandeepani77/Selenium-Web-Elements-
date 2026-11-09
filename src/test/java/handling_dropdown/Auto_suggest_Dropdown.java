package handling_dropdown31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Auto_suggest_Dropdown {
    @Test
    public static void main(String[] arge) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Google
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        // Enter text in search box
        driver.findElement(By.name("q")).sendKeys("selenium");

        // Wait for suggestions to load
        //Thread.sleep(5000);

        // Capture all search suggestions
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        System.out.println("Total suggestions: " + list.size());

        // Print and click required suggestion
        for (WebElement element : list) {
            System.out.println(element.getText());

            if (element.getText().equalsIgnoreCase("selenium")) {
                element.click();
                break;
            }

        }
    }
}