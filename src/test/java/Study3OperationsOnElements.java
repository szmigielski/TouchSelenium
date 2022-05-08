import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Study3OperationsOnElements {

    @Test
    public void Operations() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        /*By firstSite = By.xpath("//a[text()='Podstawowa strona testowa']");  //first method
        WebElement clickSite = driver.findElement(firstSite);
        clickSite.click();*/

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa")); //second method
        basicPageLink.click();

        driver.findElement(By.id("fname")).sendKeys("Witaj");
        driver.findElement(By.name("username")).clear();


        //naciskamy ENTER
        //basicPageLink.sendKeys(Keys.ENTER);

        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys("admin");
        //wybieranie select'a
        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
        cars.selectByIndex(2); //odliczanie od 0
        cars.selectByVisibleText("Saab"); //wybieranie wartości po widocznym tekście
        cars.selectByValue("volvo"); //wybierano po wartości value


        List<WebElement> options = cars.getOptions(); //WebElementy wewnątrz selecta
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        System.out.println(usernameInput.getAttribute("value")); //pobieranie wartości z pola tekstowego

        //szukanie ukrytego elementu
        WebElement paraHidden = driver.findElement(By.cssSelector(".topSecret"));
        System.out.println("By text: " + paraHidden.getAttribute("textContent"));

        usernameInput.sendKeys(Keys.ENTER);

        //Obsługiwanie alertu
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();
        driver.switchTo().alert().accept();

        //Obsługiwanie nowego okna przeglądarki

    }
}