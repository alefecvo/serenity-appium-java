package screens;

import base.BaseScreen;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChooseTopicsScreen extends BaseScreen {

    @AndroidFindBy(id = "flipboard.app:id/topic_picker_topic_row_topic_tag")
    public List<AndroidElement> topic;

    @AndroidFindBy(id = "flipboard.app:id/topic_picker_continue_button")
    public WebElement continueButton;

    @AndroidFindBy(id = "flipboard.app:id/icon_button_text")
    public WebElement skipLoginButton;

    public void chooseTopics(int topicsCount){
        for (int i = 0; i < topicsCount; i++) {
           (topic.get(i)).click();
        }
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void skipLoginButton(){
        skipLoginButton.click();
    }

}
