import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Study2XpathTest {
    //xpath, xml path language, język służący do znajdowania części dokumentu XML

    @Test
    public void seleniumTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //w konsoli webowej $x("html/body/button")
        //szukamy wszystkich tagów button $x("//button")
        driver.manage().window().maximize();
        By fullPath = By.xpath("/html/body/div/ul"); //dokładna ścieżka
        driver.findElement(fullPath);

        By shortPath = By.xpath("//ul"); //wszystkie ul na stronie
        driver.findElement(shortPath);

        By buttonId = By.xpath("/html/body/button[@id='clickOnMe']"); // lub //button[@id='clickOnMe']
        driver.findElement(buttonId);

        By firstName = By.xpath("//input[@name='fname']");
        driver.findElement(firstName);

        By paraHidden = By.xpath("//p[@class='topSecret']");
        driver.findElement(paraHidden);

        By linkText = By.xpath("//a[text()='Visit W3Schools.com!']"); //wyszukiwanie elementów po tekście
        driver.findElement(linkText);

        By partialLink = By.xpath("//a[contains(text(), 'Visit')]"); //szukamy tagów a, które zawierają text Visit
        driver.findElement(partialLink);

        By allXpath = By.xpath("//*");
        driver.findElement(allXpath);

        By secondElement = By.xpath("(//input)[2]");
        driver.findElement(secondElement);

        By lastElement = By.xpath("(//input)[last()]");
        driver.findElement(lastElement);

        By elementWithAttr = By.xpath("//*[@name]"); //dowolny element w całej strukturze, który zawiera attr name
        driver.findElement(elementWithAttr);




    }
}
