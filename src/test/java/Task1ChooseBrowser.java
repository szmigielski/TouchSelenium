import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Task1ChooseBrowser {


    @Test
    public void openPage(){
        WebDriver driver = getDriver("chrome");
        //ustawienie wielkości okna przeglądarki
        Dimension windowSize = new Dimension(200, 200);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //zamykanie przeglądarki
        //driver.quit();   //zamyka przeglądarkę
       //driver.close();  //zamyka np. okno

        //podpinamy się do pierwszego okna, które się pojawi, w tym przypadku pliki cookies
        //znalezenie przycisku
        WebElement agreeButton = driver.findElement(By.xpath("//*[@id='L2AGLb']/div"));
        agreeButton.click();
        //powrót do pierwotnego okna
        driver.switchTo().defaultContent();
        //znajdz pole do wyszukowania
        WebElement searchField = driver.findElement(By.name("q"));
        //wprowadz wartos Selenium do pola
        searchField.sendKeys("Selenium");
        //zasymuluj nacisniecie przycisku enter
        searchField.sendKeys(Keys.ENTER);




    }

    public WebDriver getDriver (String browser){ //klasa WebDriver metoda utworzona getDriver
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
            default: //jeżeli wartość będzie inna niż chrome/firefox/ie to wyrzuci nam
                throw new InvalidArgumentException("Invalid browser name.");
        }
    }
}
