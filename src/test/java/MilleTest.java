import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MilleTest {


    @Test
    public void MilleTestWeb() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://millenniumelearning.csod.com/ux/ats/careersite/2/home?c=millenniumelearning");
        driver.manage().window().maximize();


        //inputy są tworzone dynamicznie!!!
        By by = By.xpath("//span[.='Polska']");
        WebElement clickBy = driver.findElement(by);
        clickBy.click();

    }
}
