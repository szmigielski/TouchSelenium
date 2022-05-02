import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestNewPage {


    @Test
    public void TestMille(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://millenniumelearning.csod.com/ux/ats/careersite/2/home?c=millenniumelearning");


        Duration duration = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver, duration);




        driver.manage().window().maximize();

        By chooseFind = By.cssSelector("#cs-root > div > div.p-view-pagetemplate > div.p-panel.p-bg-grey80 > div > div > div > div > div > div > div.p-content-wrapper > div.p-panel.p-p-v-lg > div > div > div.p-gridcol.col-12-device-none.col-3-device-sm > div > div > div > div > div.p-panel.p-bw-t-xs.p-bc-t-grey70.p-bs-t-solid > div > div > div:nth-child(1) > div > div > div > div > div > div > div > div > div > div > div > label > span");
        WebElement check = driver.findElement(chooseFind);
        Actions actions = new Actions(driver);
        actions.moveToElement(check).click().perform();
        check.click();
    }
}
