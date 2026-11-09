package testNG;

import org.testng.annotations.Test;

public class Prorit
{
    @Test
    void login()
        {
            System.out.println("sahasra");
        }

    @Test(priority = 1)
    void Search()
    {
        System.out.println("Samdeepani");
    }

    @Test(priority = 2)
    void logout()
    {
        System.out.println("Sanath");
    }
}
