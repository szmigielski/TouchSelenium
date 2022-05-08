import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Study10ElementExistTest {

    WebDriver driver;

    @Test
    public void elementExistTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //#1 metoda
        /*System.out.println(elementExist(By.tagName("p")));
        System.out.println(elementExist(By.id("topSecret")));*/


        //#2 metoda
        System.out.println(elementExistSecond(By.tagName("p")));
        System.out.println(elementExistSecond(By.id("topSecret")));

    }

    //#1 metoda zwraca true albo false, czy istnieje element na stronie
/*    public boolean elementExist(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }*/

    //#2 metoda, wykorzystanie listy
    public boolean elementExistSecond(By locator){
        return driver.findElements(locator).size() > 0;
    }

}
