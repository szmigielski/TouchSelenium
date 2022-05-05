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
    

        By shortPath = By.xpath("//ul"); //wszystkie ul na stronie


        By buttonId = By.xpath("/html/body/button[@id='clickOnMe']"); // lub //button[@id='clickOnMe']


        By firstName = By.xpath("//input[@name='fname']");

        By paraHidden = By.xpath("//p[@class='topSecret']");


        By linkText = By.xpath("//a[text()='Visit W3Schools.com!']"); //wyszukiwanie elementów po tekście


        By partialLink = By.xpath("//a[contains(text(), 'Visit')]"); //szukamy tagów a, które zawierają text Visit


        By allXpath = By.xpath("//*");


        By secondElement = By.xpath("(//input)[2]");

        By lastElement = By.xpath("(//input)[last()]");

        By elementWithAttr = By.xpath("//*[@name]"); //dowolny element w całej strukturze, który zawiera attr name


        By startsWith = By.xpath("//*[starts-with(@name, 'user')]"); //wartosc atrybutu name rozpoczyna sie od user
        By attrEq = By.xpath("//button[@id='clickOnMe']"); //szukamy buttona dla którego wartość atr id = clickOnMe
        By attrNotEq = By.xpath("//*[@id!='clickOnMe']");
        By attrCont = By.xpath("//*[contains(@name, 'ame')]"); //dowolny element, którego wartość atr name zawiera 'ame'





    }
}
