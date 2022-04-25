import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FirstOpenIE {

    @Test
    public void openUdemyPage(){
        System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.udemy.com");
    }
}
