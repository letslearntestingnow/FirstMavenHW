package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAFriend
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

        // Find the link containing "Apple MacBook Pro 13-inch" on the homepage and perform click action on it
        driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();

        // Click on "Email a friend" button on this webpage
        driver.findElement(By.xpath("// button [@class='button-2 email-a-friend-button']")).click();

        // Fill friend's email id
        driver.findElement(By.id("FriendEmail")).sendKeys("abc@mail.com");
        // Fill own email id
        driver.findElement(By.id("YourEmailAddress")).sendKeys("xyz@mail.com");
        // Fill personal message
        driver.findElement(By.id("PersonalMessage")).sendKeys("Check this out!!!");
        // Click the "SEND EMAIL" button
        driver.findElement(By.name("send-email")).click();

        // Get the text from the error message displayed
        String strTitleText = driver.findElement(By.xpath("//*[contains(text(),'Only')]")).getText();
        System.out.println(strTitleText);

        // Close the Chrome browser and end session
        driver.quit();

    }
}
