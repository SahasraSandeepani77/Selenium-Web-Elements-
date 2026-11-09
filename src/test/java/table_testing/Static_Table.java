package table_testing32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Static_Table {
    @Test
        public static void main(String[] arge) {
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Open Google Browser------------------
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();

        //Find total number of rows in the table------------

        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // For Multipale table in web page
        // int rows = driver.findElements(By.tagName("tr")).size();  // For a single table in web page

        System.out.println("Number of rows: " + rows); // Output: 7

        //Find total number of columns in a table------------------

        int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); // For Multipale table in web page
        // int cols = driver.findElements(By.tagName("th")).size();    // For a single table in web page

        System.out.println("Number of columns is: " + cols); // Output: 4

        //Read data from a specific row and column (e.g., 5th row, 1st column)--------------------------

        String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        // System.out.println(bookName); // Output: Master In Selenium

       // Read data from all rows and columns (excluding header row)----------

        for(int r = 2; r <= rows; r++) {
            for(int c = 1; c <= cols; c++) {
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        // Print book names whose author is Mukesh-------------

        for(int r = 2; r <= rows; r++)
        {
            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']/tr[" + r + "]/td[2]")).getText();

            if(authorName.equals("Mukesh")) {
                String bookNamee = driver.findElement(By.xpath("//table[@name='BookTable']/tr[" + r + "]/td[1]")).getText();
                System.out.println(bookName + "\t" + authorName);
            }
        }

        // Fibd the total price nicely------------------
        int total=0;
        for (int r=2;r<=rows;r++)
        {
            String price = driver.findElement(By.xpath("//table[@name='BookTable']/tr[" + r + "]/td[4]")).getText();
            System.out.println(price); // price details are displayed
            total = total+Integer.parseInt(price);
        }

        System.out.println("Tatal Price of the Books"+total);

    }
}