package tests;

import base.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.FlipboardSteps;

@RunWith(SerenityRunner.class)
public class SearchItemTest extends BaseTest {

    @Managed(driver = "appium")
    public WebDriver driver;

    @Steps
    FlipboardSteps flipboard;

    @Test
    public void searchItemTest(){
        flipboard.clickGetStartedButton();
        flipboard.chooseTopics(4);
        flipboard.clickContinueButton();
        flipboard.skipLoginButton();
        flipboard.selectBottomPanel(3);
        flipboard.searchFlipBoard("Airpod");

    }
}
