import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class MyStudy1Millennium {

    @Test
    public void millenniumTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bankmillennium.pl/");
        WebElement acceptCookie = driver.findElement(By.xpath("//*[@id='cookie-m-button-allow']"));
        acceptCookie.click();
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        driver.manage().window().maximize();

        By carrerPath = By.cssSelector("#portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_SC_FOOTER_MIDDLE_COL2 > div > div.portlet-content-container > div > div.clearfix.journal-content-article > div > ul > li:nth-child(2) > a > span");
        WebElement carrerClick = driver.findElement(carrerPath);
        carrerClick.click();

        By jobOffers = By.cssSelector("#portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_BNyVqt6dwJW1 > div > div.portlet-content-container > div > div.clearfix.journal-content-article > wc-anchornav > div > div > div > nav > ul > li.bmp-anchorNav__last > div > a > span:nth-child(2)");
        WebElement checkOffers = driver.findElement(jobOffers);
        checkOffers.click();

        //checking which window is opened
        System.out.println(driver.getCurrentUrl());
        //checking all windows
        //System.out.println(driver.getWindowHandles());

        Set<String> openedWindows = driver.getWindowHandles();


        //System.out.println(openedWindows);
        //System.out.println(openedWindows.size());

        //System.out.println(openedWindows);


        if (openedWindows.size() == 1){
            System.out.println("Otwarte jest tylko jedno okno.");
        } else {
            System.out.println("Otwarte sa " + openedWindows.size() + " okna, przechodze do ostatniego okna.");
        }


        Iterator <String> it = openedWindows.iterator();
        String tab1 = it.next();
        String tab2 = it.next();

        System.out.println("Spis otwartych okien w przegladarce: ");
        for (String showWindows : openedWindows) {
            System.out.println(showWindows);
            }


        driver.switchTo().window(tab1);
        driver.close();
        driver.switchTo().window(tab2);

        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getCurrentUrl());

        




    }
}
