import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Study14SecondTestNG extends Study14BaseTestNG {

    @Test
    public void firstTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        String paraText = driver.findElement(By.cssSelector("p")).getText();


        //asercja weryfikuje nam czy rezultat jest poprawny, w tym przypadku czy tekst paragrafu jest pusty
        //Assert.assertEquals(paraText, "Dopiero sie pojawilem");
    }
    @Test
    public void secondTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        String paraText = driver.findElement(By.cssSelector("p")).getText();


        //asercja weryfikuje nam czy rezultat jest poprawny, w tym przypadku czy tekst paragrafu jest pusty
        //Assert.assertEquals(paraText, "Dopiero sie pojawilem");
    }
}
