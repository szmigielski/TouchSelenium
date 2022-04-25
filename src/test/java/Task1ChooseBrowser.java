import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class Task1ChooseBrowser {

    @Test
    public void openPage(){
        WebDriver driver = getDriver("chrome");
    }

    public WebDriver getDriver (String browser){
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\ChromeDriver\\chromedriver.exe");
                return new ChromeDriver();
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\FirefoxDriver\\geckodriver.exe");
                return new FirefoxDriver();
            case "IE":
                System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriver\\IEDriverServer.exe");
                return new InternetExplorerDriver();
            default:
                throw new InvalidArgumentException("Invalid browser name.");
        }
    }
}
