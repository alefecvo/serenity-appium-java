package screens;

import base.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SearchScreen extends BaseScreen {


    @AndroidFindBy(id= "flipboard.app:id/search_box_place_holder")
    public WebElement searchBox;

    @AndroidFindBy(id="flipboard.app:id/search_view_input")
    public WebElement searchInput;

    public void searchFlipBoard(String searchText){
        searchBox.click();
        waitFor(searchInput).sendKeys(searchText);
        enter();
    }

}
