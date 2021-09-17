package tests;

import Pages.HomePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class Testy extends TestBase{
    WebDriver driver;
    HomePage homePage;

    public Testy () {
        super();
    }

    @Before
    public void before(){
        setup();

    }
    @Test
    public void searchTest(){
        HomePage homePage = new HomePage();
        homePage.goToUrl("http://automationpractice.com/index.php");
        homePage.searchForProduct("gacie");
        driver.quit();

    }
}