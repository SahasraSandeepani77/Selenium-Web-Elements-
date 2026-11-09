package date_pickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

public class Dropdown_Datepikers
{
    //user defined method for converting month from String---->Month
    static Month convertMonth(String month) {
        HashMap<String, Month> monthly = new HashMap<String, Month>();
        monthly.put("January", Month.JANUARY);
        monthly.put("February", Month.FEBRUARY);
        monthly.put("March", Month.MARCH);
        monthly.put("April", Month.APRIL);
        monthly.put("May", Month.MAY);
        monthly.put("June", Month.JUNE);
        monthly.put("July", Month.JULY);
        monthly.put("August", Month.AUGUST);
        monthly.put("September", Month.SEPTEMBER);
        monthly.put("October", Month.OCTOBER);
        monthly.put("November", Month.NOVEMBER);
        monthly.put("December", Month.DECEMBER);

        Month vmonth = monthly.get(month);

        if (vmonth == null)
        {
            System.out.println("Invalid Month...");
        }

        return vmonth;
    }


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //input DOB-------------------------
        String requiredYear = "2021";
        String requiredMonth = "June";
        String requiredDate = "15";

        driver.switchTo().frame("frame-one796456169");
        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

        //select year------------------------------------------------
        WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByVisibleText(requiredYear);

        //Select Month----------------------------------------------------------------
        while(true) {
            String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            //convert requiredMonth & displayMonth into Month Objects
            Month expectedMonth = convertMonth(requiredMonth);
            Month currentMonth = convertMonth(displayMonth);

            //compare
            int result = expectedMonth.compareTo(currentMonth);

            // 0 months are equal
            // >0 future month (expected month is after current month)
            // <0 past month (expected month is before current month)

            if(result < 0) // past
            {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            }
            else if(result > 0) // future
            {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
            else
            {
                break;
            }

        }

        // date Selection-----------------------------------------------------------
        List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for (WebElement dt:alldates)
        {
            if (dt.getText().equals(requiredDate))
            {
                dt.click();
                break;
            }
        }
    }
}
