package mouse_action35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Action_vs_Actions
{
    @Test
    public static void main(String[] arge) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act = new Actions(driver);

        Action myaction = act.contextClick(button).build(); // building/creating an action and storing into a variable

        myaction.perform(); // performing/completing the action
    }
}


// Assignments
//---
//1) double click & Drag and drop
//https://testautomationpractice.blogspot.com/
//2) drag and drop
//http://demo.guru99.com/test/drag_drop.html




