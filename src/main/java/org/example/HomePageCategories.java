package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCategories
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

        // Find the link containing "computers" from the notmobile section of the webpage and get the link text from it
        String strTitleText = driver.findElement(By.xpath("//ul [@class='top-menu notmobile'] // * [contains(@href,'computers')]")).getText();
        System.out.println(strTitleText);

        // Find the link containing "electronics" from the notmobile section of the webpage and get the link text from it
        strTitleText = driver.findElement(By.xpath("//ul [@class='top-menu notmobile'] // * [contains(@href,'electronics')]")).getText();
        System.out.println(strTitleText);

        // Find the link containing "apparel" from the notmobile section of the webpage and get the link text from it
        strTitleText = driver.findElement(By.xpath("//ul [@class='top-menu notmobile'] // * [contains(@href,'apparel')]")).getText();
        System.out.println(strTitleText);

        // Find the link containing "digital-" from the notmobile section of the webpage and get the link text from it
        strTitleText = driver.findElement(By.xpath("//ul [@class='top-menu notmobile'] // * [contains(@href,'digital-')]")).getText();
        System.out.println(strTitleText);

        // Find the link containing "books" from the notmobile section of the webpage and get the link text from it
        strTitleText = driver.findElement(By.xpath("//ul [@class='top-menu notmobile'] // * [contains(@href,'books')]")).getText();
        System.out.println(strTitleText);

        // Find the link containing "jewelry" from the notmobile section of the webpage and get the link text from it
        strTitleText = driver.findElement(By.xpath("//ul [@class='top-menu notmobile'] // * [contains(@href,'jewelry')]")).getText();
        System.out.println(strTitleText);

        // Find the link containing "gift-" from the notmobile section of the webpage and get the link text from it
        strTitleText = driver.findElement(By.xpath("//ul [@class='top-menu notmobile'] // * [contains(@href,'gift-')]")).getText();
        System.out.println(strTitleText);

        // Close the Chrome browser and end session
        driver.quit();
    }
}
