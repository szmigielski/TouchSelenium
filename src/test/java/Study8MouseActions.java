import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Study8MouseActions {

    @Test
    public void mouseClick(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");

        Actions actions = new Actions(driver);
        //kliknięcie PPM w dowolnym miejscu
        actions.contextClick().perform(); //perform = wykonaj
        //kliknięcie PPM w konkretnym miejscu
        actions.contextClick(driver.findElement(By.id("myFile"))).perform();

        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");
        //podwójne kliknięcie
        WebElement button = driver.findElement(By.id("bottom"));
        actions.doubleClick(button).perform();

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement heading = driver.findElement(By.tagName("h1"));
        actions.moveToElement(heading).perform();
    }
}
