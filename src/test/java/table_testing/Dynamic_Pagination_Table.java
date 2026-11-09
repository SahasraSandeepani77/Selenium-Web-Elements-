package table_testing32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dynamic_Pagination_Table {
    @Test
    public static void main(String[] arge) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Google Browser------------------
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();

        // Login and Clear login suggetion box-----------------
        WebElement username = driver.findElement(By.xpath(""));
        username.clear();
        username.sendKeys("sahas");

        WebElement password = driver.findElement(By.xpath(""));
        password.clear();
        password.sendKeys("123sds");

        // Click the Login Button.............................................
        driver.findElement(By.xpath("")).click();

        //close window if it is available---------------------------------- Infromation box iis coming
        if (driver.findElement(By.xpath("")).isDisplayed())
        {
            driver.findElement(By.xpath("")).click();
        }

        // Customer main menu------------------------------
        driver.findElement(By.xpath("")).click();

        // Customer sub menu------------------------------
        driver.findElement(By.xpath("")).click();

        // Showing 1 to 10 of 19081 (1909 Pages)---------------------
        String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();

        int total_pages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));

        // repeating pages----------------------------------------------
        for(int p = 1; p <= 5; p++) {
            if(p > 1)
            {
                WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()='"+p+"']"));
                active_page.click();
                //Thread.sleep(3000); // error here
            }
        }

        // reading data from the page-----------------------------------------------------
        int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();

        for(int r = 1; r <= noOfRows; r++) {
            String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[1]")).getText();
            String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
            String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();

            System.out.println(customerName + "\t" + email + "\t" + status);
        }



    }
}