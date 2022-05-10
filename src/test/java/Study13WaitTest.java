import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Study13WaitTest {

    @Test
    public void SleepTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //lepsza wersja od Thread.sleep() - timeout dla całej strony
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.id("clickOnMe")).click();
//        Thread.sleep(5000);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        driver.findElement(By.cssSelector("p"));
    }

}
