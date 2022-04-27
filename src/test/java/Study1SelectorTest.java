import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Study1SelectorTest {


    @Test
    public void findElementsById(){
        //pobranie i ustawienie ścieżki do drivera
        WebDriverManager.chromedriver().setup();
        //nowy obiekt klasy ChromeDriver
        WebDriver driver = new ChromeDriver();
        //pobranie adresu url
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //ustawienie wielkości okna przeglądarki
        driver.manage().window().maximize();

        //import klasy By, wywołuję metode id, podaje wartość
        By buttonId = By.id("clickOnMe");
        //znajduje element "clickOnMe"
        //driver.findElement(buttonId);
        WebElement cickOnMeButton = driver.findElement(buttonId);

        cickOnMeButton.click();

    }

    @Test
    public void findElementsByName(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //driver.findElement(By.name("fname"));
        //obiekt klasy By
        By firstName = By.name("fname");
        WebElement firstNameInput = driver.findElement(firstName);

        firstNameInput.click();
    }

    @Test
    public void findElementsByClass(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By paragraph = By.className("topSecret");
        driver.findElement(paragraph);
    }



    @Test
    public void findElementByTag(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy: ");
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());

    }



}
