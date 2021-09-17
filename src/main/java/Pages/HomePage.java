package Pages;
import org.jbehave.core.annotations.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;

public class HomePage extends TestBase {

    @FindBy (id ="search_query_top")
    WebElement quickSearch;

    @FindBy (name = "submit_search")
    WebElement searchConfirm;

    public void searchForProduct(String productName){
        quickSearch.sendKeys(productName);
        searchConfirm.click();

    }
    public void goToUrl(final String url){
        driver.get(url);
    }
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

}
