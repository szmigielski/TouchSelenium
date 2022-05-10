import org.testng.annotations.*;

public class Study14BaseTestNG {

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am running before test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am running before method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I am running after test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am running after method");
    }
}
