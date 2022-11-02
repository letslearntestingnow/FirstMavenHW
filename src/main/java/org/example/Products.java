package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products
{
    // Create a WebDriver object in global space
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        // Inform the system the location of Chrome driver
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");

        // Initialise the WebDriver object, which means it will open a new Chrome browser window
        driver = new ChromeDriver();
        // Maximize the Chrome browser window
        driver.manage().window().maximize();
        // Ask the browser to navigate to the given URL
        driver.get("https://demo.nopcommerce.com/");

        // Find the element -Computers (by link text) - on the homepage and perform click action on it
        driver.findElement(By.linkText("Computers")).click();
        // Find the element -Desktops (by link text) - on the homepage and perform click action on it
        driver.findElement(By.linkText("Desktops")).click();

        // Find the link which contains the word - "build" and get the link text
        String strTitleText = driver.findElement(By.xpath("// h2 //*[contains(@href,'build')]")).getText();
        System.out.println(strTitleText);

        // Find the link which contains the word - "vanquish-" and get the link text
        strTitleText = driver.findElement(By.xpath("// h2 //*[contains(@href,'vanquish-')]")).getText();
        System.out.println(strTitleText);

        // Find the link which contains the word - "lenovo-" and get the link text
        strTitleText = driver.findElement(By.xpath("// h2 //*[contains(@href,'lenovo-')]")).getText();
        System.out.println(strTitleText);

        // Close the Chrome browser and end session
        driver.quit();
    }
}
