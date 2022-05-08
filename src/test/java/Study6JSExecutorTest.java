import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Study6JSExecutorTest {

    @Test
    public void executeJavascript(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        //alternatywa dla metody .click() jeśli nie działa
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", basicPageLink);

        WebElement firstName = driver.findElement(By.name("fname"));
        //alternatywa dla metody .sendKeys()
        executor.executeScript("arguments[0].setAttribute('value', 'Bartek');", firstName);
    }
}
