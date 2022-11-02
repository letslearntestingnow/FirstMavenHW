package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments
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

        // Find the "Details" button for the middle column in the news on the homepage and perform click action on it
        driver.findElement(By.xpath("//a [@href=\"/nopcommerce-new-release\" and @class=\"read-more\"]")).click();

        // Fill the Title box as per the input provided below
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("MyTitle");
        // Fill the Comment box as per the input provided below
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("My Comment");
        // Click the "New Comment" button
        driver.findElement(By.name("add-comment")).click();

        // Get the resultant Text displayed from thr webpage
        String strNewsSuccessfulText = driver.findElement(By.className("result")).getText();
        System.out.println(strNewsSuccessfulText);

        // Close the Chrome browser and end session
        driver.quit();
    }
}
