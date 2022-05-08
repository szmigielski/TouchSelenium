import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Study4NewWindowTest {

    @Test
    public void testNewWindow(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        String currentWindow = driver.getWindowHandle(); //nazwa pierwotnego okna, przed kliknięciem na przycisk newPage
        driver.findElement(By.id("newPage")).click();
        Set<String> windowNames = driver.getWindowHandles(); //nazwy okien, które są dostępne


        for (String window : windowNames){
            //czy nazwa okna jest różna od currentWindow
            if (!window.equals(currentWindow)){ //jeśli jest różna, jest to nowe okno
                driver.switchTo().window(window); //przełączanie do nowego okna
            }
        }
        driver.findElement(By.cssSelector("#L2AGLb > div")).click(); //akceptacja cookie
        driver.findElement(By.name("q")).sendKeys("Selenium");

        driver.switchTo().window(currentWindow); // przełączanie do pierwotnego okna
    }
}
