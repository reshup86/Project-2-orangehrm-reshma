package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi_Browser {

    static String browser = "chrome";

    static String baseURL = "https://opensource-demo.orangehrmlive.com/";

    static WebDriver driver;

    public static void main(String[] args) {
        //set up for chrome browser
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("webdriver.chrome.driver\",\"drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        //set up for firefox browser
        else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("webdriver.firefox.driver\", \"drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        //set up for edge browser
        else if (browser.equalsIgnoreCase("edge")) {
            System.out.println("webdriver.edge.driver\", \"drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        //Open URL
        driver.get(baseURL);
        //Open with maximize window
        driver.manage().window().maximize();
        //set time duration between open and close the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Print the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Enter the email to email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //close the driver
        driver.quit();
    }
}
