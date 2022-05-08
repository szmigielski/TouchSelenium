import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class Study11ElementIsDisplayed {

    public void elementIsDisplayed(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //sprawdzam czy element jest wyświetlony
        System.out.println(driver.findElement(By.tagName("p")).isDisplayed());
        System.out.println(driver.findElement(By.tagName("button")).isDisplayed());

        //sprawdzam czy mogę wejść w interakcję z elementem
        System.out.println(driver.findElement(By.tagName("p")).isEnabled());

        //sprawdzam czy element został zaznaczony
        WebElement checkbox = driver.findElement(By.cssSelector("[type='checkbox']"));
        checkbox.click();
        System.out.println(checkbox.isSelected());

    }
}
