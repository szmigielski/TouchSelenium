import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Study1SelectorTest {

    @Test
    public void webDriverSetup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
    }

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
        //zwracamy pojedynczy WebElement, czyli element znajdujący się na stronie
        WebElement input = driver.findElement(inputLocator);
        //umieszczamy dane do pierwszego inputa
        input.sendKeys("Pierwszy input");
        //tworzymy listę, która będzie zawierała WebElementy
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println("Liczba inputow: " + (inputs.size()));
    }

    @Test
    public void findElementByHref(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By linkText = By.linkText("Visit W3Schools.com!");
        WebElement schoolLink = driver.findElement(linkText);
        schoolLink.click();

        /*wyszukiwanie po fragmencie znaków
        By partialLink = By.partialLinkText("Visit");
        WebElement findLink = driver.findElement(partialLink);
        findLink.click();*/
    }

    @Test
    public void findElementsByCss(){
        //Wyszukiwanie za pomocą selektorów css
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By cssId = By.cssSelector("#clickOnMe"); //wyszukiwanie po id -> #
        driver.findElement(cssId);

        By cssClass = By.cssSelector(".topSecret"); //wyszukiwanie po klasie -> .
        driver.findElement(cssClass);

        By cssTag = By.cssSelector("input"); //wyszukiwanie po tagu -> bez znaków
        driver.findElement(cssTag).sendKeys("Pierwszy");

        By cssName = By.cssSelector("[name='fname']"); //wyszukiwanie po wartosci atrybutu
        driver.findElement(cssName);

        /*przyklad
        By cssClass2 = By.cssSelector("[class='topSecret']"); //wyszukiwanie po klasie -> .
        driver.findElement(cssClass2);*/


        By all = By.cssSelector("*"); //zwracanie wszystkich tagów -> *
        driver.findElement(all); //jeśli będzie findElement -> wskaże nam pierwszy tag

        By ulInDiv = By.cssSelector("div ul"); //zwraca 2 listy, które znajdują się wewnątrz tagu div
        driver.findElement(ulInDiv);

        By trInTable = By.cssSelector("table tr"); //zwraca ilość tr'ów w table
        driver.findElement(trInTable);

        By trInBody = By.cssSelector("tbody tr"); // zwraca ilość tr'ów w body
        driver.findElement(trInBody);

        By firstChildUlInDiv = By.cssSelector("div > ul"); //bezpośredni element po tagu -> >
        driver.findElement(firstChildUlInDiv);

        By firstChildTrInBody = By.cssSelector("tbody > tr"); //bezpośredni element po tagu -> >
        driver.findElement(firstChildTrInBody); //table tbody tr <- table > tr nie będzie działać

        By firstFormInLabel = By.cssSelector("label + form"); //pierwszy formularz po tagu label
        driver.findElement(firstFormInLabel);

        By allFormsInLabel = By.cssSelector("label ~ form"); //wszystkie formularze po tagu label
        driver.findElement(allFormsInLabel);

        //znajduje nam same inputy ktore maja wartosc atrybutu name rowna fname
        By attrTag = By.cssSelector("input[name='fname']");


        //wyszukiwanie wszystkich elementów dla których wartość atrybutu name zawiera wartosc ame
        By attrContains = By.cssSelector("[name*='ame']");

        //wyszukiwanie wszystkich elementów dla których wartość atrybutu name zawiera wartosc poczatkowa fn
        By attrStarts = By.cssSelector("[name^='fn']");

        //wyszukiwanie wszystkich elementów dla których wartość atrybutu name zawiera wartosc na koncu name
        By attrEnds = By.cssSelector("[name$='name']");

        driver.findElement(attrTag);
        driver.findElement(attrContains);
        driver.findElement(attrStarts);
        driver.findElement(attrEnds);

        //selektory css, które pozwolą wybrać nam pierwsze/ostatnie dowolne dziecko z tagu nadrzędnego
        By firstChild = By.cssSelector("li:first-child");
        By lastChild = By.cssSelector("li:last-child");
        By thirdChild = By.cssSelector("li:nth-child(3)");


        driver.findElement(firstChild);
        driver.findElement(lastChild);
        driver.findElement(thirdChild);






    }



}
