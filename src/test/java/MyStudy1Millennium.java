import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyStudy1Millennium {

    @Test
    public void millenniumTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bankmillennium.pl/");
        WebElement acceptCookie = driver.findElement(By.xpath("//*[@id='cookie-m-button-allow']"));
        acceptCookie.click();

        driver.manage().window().maximize();

        By carrerPath = By.cssSelector("#portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_SC_FOOTER_MIDDLE_COL2 > div > div.portlet-content-container > div > div.clearfix.journal-content-article > div > ul > li:nth-child(2) > a > span");
        WebElement carrerClick = driver.findElement(carrerPath);
        carrerClick.click();

        By jobOffers = By.cssSelector("#portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_BNyVqt6dwJW1 > div > div.portlet-content-container > div > div.clearfix.journal-content-article > wc-anchornav > div > div > div > nav > ul > li.bmp-anchorNav__last > div > a > span:nth-child(2)");
        WebElement checkOffers = driver.findElement(jobOffers);
        checkOffers.click();



    }
}
