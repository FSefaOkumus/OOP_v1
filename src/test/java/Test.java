import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class Test extends Functions{
    @Before
    public void setUp(){
        Mainpage();
    }
    @org.junit.Test
    public void TestClass() throws InterruptedException {

        Checkpage();
        Login();
        Search();
        NavToPage2();
        PickRandomItem();
        ItemDetails();
        AddAndGoBasket();
        ComparePrice();
        IncProductNumber();
        CheckNumberOfProduct();
        DeleteItems();
    }
    @After
    public void quitDriver(){
    quit();
    }

}
