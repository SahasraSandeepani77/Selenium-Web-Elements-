package date_pickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Future_Past_Datepikers
{
    static void selectFututerDate(WebDriver driver, String month, String year, String date)
    {
        // Select Futute Date-------------------------------------------------------
        while(true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if(currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }

            // Navigate to next month--------------------------------------
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next

            // Navigate to previous month-------------------------------------------
            // driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Previous

        }

        // Select the date from calendar-----------------------------------------------------
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
        for (WebElement dt:allDates)
        {
            if (dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }

    // Select Past Date-------------------------------------------------------
    static void selectPastDate(WebDriver driver, String month, String year, String date)
    {
        // Select Futute Date-------------------------------------------------------
        while(true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if(currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }

            // Navigate to next month--------------------------------------
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next

            // Navigate to previous month-------------------------------------------
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Previous

        }

        // Select the date from calendar-----------------------------------------------------
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
        for (WebElement dt:allDates)
        {
            if (dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }


    @Test
    public static void main(String[] arge)
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // Switch to frame-----------------
        driver.switchTo().frame(0);

        // Method 1: using sendKeys()----------------------------------
        // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024"); // mm/dd/yyyy

        // Method 2: using date picker------------------------------------------------------
        // Expected date values
        String year = "2025";
        String month = "May";
        String date = "20";


        //Open the date picker-------------------------------------------------------
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        //String year = "2025"; // Error is comming why? vedio not display error?//
        //String month = "May";
        //String date = "20";

        //selectPastDate(driver,year,month,date);
        selectFututerDate(driver,year,month,date);


    }
}
