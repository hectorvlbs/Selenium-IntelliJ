import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Set the property for webdriver.chrome.driver to be the location to your
        // local download of chromedrive
        String s = "/Users/villalobos28/Desktop/chromedriver";
        System.setProperty("webdriver.chrome.driver", s);

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit http://formy-project.herokuapp.com/keypress
        driver.get("http://formy-project.herokuapp.com/keypress");

        // Find the text input element by its id
        WebElement input = driver.findElement(By.id("name"));
        // Find the button
        WebElement button = driver.findElement(By.id("button"));

        // Enter my last name
        input.sendKeys("Villalobos");

        // Now click the form button
        //element.click();
        button.click();
        
        //Close the browser
        driver.quit();
    }
}
