import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Study7UploadAndScreenshot {

    @Test
    public void uploadFile() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");

        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\damia\\Desktop\\java.txt");

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        //zmienna typu File, odwołuję się do zmiennej screenshot, metoda getScreenshotAs
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        //kopiujemy utworzony plik do określonej scieżki
        FileUtils.copyFile(srcFile, new File("src/test/resources/screenshot.png"));
    }
}
