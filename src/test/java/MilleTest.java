import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class MilleTest {


    @Test
    public void MilleTestWeb() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://millenniumelearning.csod.com/ux/ats/careersite/2/home?c=millenniumelearning");
        driver.manage().window().maximize();


        //inputy są tworzone dynamicznie!!!

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.findElement(By.xpath("//label[@class='p-checkbox enabled']")).getText();

//        System.out.println(driver.findElement(By.xpath("//label[@class='p-checkbox enabled']")).getText());
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"keywordSearchDsk\"]")).sendKeys("Tester");
        driver.findElement(By.xpath("//*[@id=\"locationSearchDsk\"]")).sendKeys("Wrocław");
        driver.findElement(By.xpath("//*[@id=\"locationSearchDsk\"]")).sendKeys(Keys.ENTER);
       // driver.findElement(By.cssSelector("#cs-root > div > div.p-view-pagetemplate > div.p-panel.p-bg-grey80 > div > div > div > div > div > div > div.p-content-wrapper > div.p-panel.p-p-v-lg > div > div > div.p-gridcol.col-12-device-none.col-9-device-sm > div > div:nth-child(3) > div > div > div > a"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cs-root\"]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div/div/div/a")));
        driver.findElement(By.xpath("//*[@id=\"cs-root\"]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div/div/div/a")).click();


    }
}
