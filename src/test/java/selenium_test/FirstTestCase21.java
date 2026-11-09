package selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestCase21
{

    @Test
    public void googleopen()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");

        String act_title =  driver.getTitle();
       if(act_title.equals("Want to practice test automation? Try these demo sites! | Automation Panda"))
       {
           System.out.println("Test Pass");
       }
       else
       {
           System.out.println("Test Fail");
       }
    }
        

}
