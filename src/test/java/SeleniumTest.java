import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static void main(String[]args ){
        WebDriver driver = new FirefoxDriver();
    }


    //dzięki temu możemy uruchomić funkcję przyciskiem "play"
    @Test
    public void sampleTest(){
        System.out.println("Hello! ");
    }
}
