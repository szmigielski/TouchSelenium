import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstOpenFirefox {

    @Test
    public void openGmailPage(){
        System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\FirefoxDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.gmail.com");
    }
}
