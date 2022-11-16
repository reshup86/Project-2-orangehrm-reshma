package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser {
    public static void main(String[] args) {
        String baseURL = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        //get the title of the page
        String title = driver.getTitle();

        //Print the current URL
        System.out.println("Current URL is: " +driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source is: " +driver.getPageSource());

        //Enter the email to email field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        //Enter the password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //Close the browser
        driver.quit();
    }
}
