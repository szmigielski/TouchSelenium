import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstOpenChrome {

    @Test
    public void openGooglePage(){
        //wskazujemy scieżkę do chromedriver oraz ustawiamy ją we właściwościach ścieżki
        String path = "D:\\Drivers\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        //tworzymy nowy obiekt klasy ChromeDriver interfejsu WebDriver
        WebDriver driver = new ChromeDriver();


        //Otwieramy google.com
        driver.get("https://google.com");

    }
}
