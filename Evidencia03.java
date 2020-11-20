import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

private class Evidencia03 {
    public static void main(String[] args) {

        /*
            Evidencias: Crear una prueba apra desplazarse entre el sitio y moverse entre las
            ventanas activas del navegador.
        */

        String Chromedriver = "/Users/villalobos28/Desktop/chromedriver";
        System.setProperty("webdriver.chrome.driver", Chromedriver);
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://joseferjuan.wordpress.com/");
        //  class="site-footer"
        WebElement footer = Driver.findElement(By.className("site-footer"));

        //  class="header-wrapper"
        WebElement header = Driver.findElement(By.className("header-wrapper"));
        //  Interacciones de desplazamiento
        Actions actions = new Actions(Driver);
        actions.moveToElement(footer);
        actions.moveToElement(header);

        //  id="menu-item-2625" (Presentación)
        WebElement presentation = Driver.findElement(By.id("menu-item-2625"));
        presentation.click();

        //  id="menu-item-4970" (Reflexiones)
        WebElement education = Driver.findElement(By.id("menu-item-4970"));
        education.click();

        String originalHandle = Driver.getWindowHandle();
        for (String handle_index : Driver.getWindowHandles() ) {
            try {
                Thread.sleep(1000);
                Driver.switchTo().window(handle_index);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
        Driver.switchTo().window(originalHandle);
        Driver.quit();

    }
}