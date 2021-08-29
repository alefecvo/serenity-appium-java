package tests;

import base.BaseTest;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.FlipboardSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("data/searchItem.csv")
public class SearchItemTest extends BaseTest {

    private String searchitem;

    public void setSearchitem(String searchitem) {
        this.searchitem = searchitem;
    }


    @Managed(driver = "appium")
    public WebDriver driver;

    @Steps
    FlipboardSteps flipboard;

    @Test
    public void searchItemTest(){
        flipboard.clickGetStartedButton();
        flipboard.chooseTopics(3);
        flipboard.clickContinueButton();
        flipboard.skipLoginButton();
        flipboard.selectBottomPanel(3);
        flipboard.searchFlipBoard(searchitem);
        flipboard.verifySearchText(searchitem);
    }
}
