import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;


public class MyStudy1Millennium {

    @Test
    public void millenniumTest() throws InterruptedException {
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

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"keywordSearchDsk\"]")).sendKeys("Tester");
        driver.findElement(By.xpath("//*[@id=\"locationSearchDsk\"]")).sendKeys("Wrocław");
        driver.findElement(By.xpath("//*[@id=\"locationSearchDsk\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        By tester = By.xpath("//*[@id=\"cs-root\"]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div/div/div/a");
        driver.findElement(tester).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@data-tag='applyNowButton']")).click();
        Thread.sleep(5000);
        By firstName = By.xpath("//*[@id='actionItem.firstName.idTag']");
        driver.findElement(firstName).sendKeys("Damian");
        By lastName = By.xpath("//*[@id=\"actionItem.lastName.idTag\"]");
        driver.findElement(lastName).sendKeys("Szmigielski");
        By mail = By.xpath("//*[@id=\"actionItem.email.idTag\"]");
        driver.findElement(mail).sendKeys("damian.szmigielski.it@gmail.com");
        By dateOfBirth = By.xpath("//input[@type='text']");
        driver.findElement(dateOfBirth).sendKeys("23.12.1997");
        By adress = By.xpath("//*[@id='contactDetails_addressLine1']");
        driver.findElement(adress).sendKeys("ul. Gersona 8/23");
        By country = By.xpath("//*[@id='contactDetails_city']");
        driver.findElement(country).sendKeys("Wrocław");
        By zipCode = By.xpath("//*[@id='contactDetails_zipCode']");
        driver.findElement(zipCode).sendKeys("51-664");
        By phoneContact = By.xpath("//*[@id='contactDetails_phone']");
        driver.findElement(phoneContact).sendKeys("510545720");







    }
}
