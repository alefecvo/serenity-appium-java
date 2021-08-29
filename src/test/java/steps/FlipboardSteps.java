package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import screens.ChooseTopicsScreen;
import screens.HomeScreen;
import screens.LoginScreen;
import screens.SearchScreen;

public class FlipboardSteps {

    LoginScreen loginScreen;
    ChooseTopicsScreen chooseTopicsScreen;
    HomeScreen homeScreen;
    SearchScreen searchScreen;

    @Step
    public void clickGetStartedButton(){
        loginScreen.clickGetStartedButton();
    }

    @Step
    public void chooseTopics(int topicCount){
        chooseTopicsScreen.chooseTopics(topicCount);
    }

    @Step
    public void clickContinueButton(){
        chooseTopicsScreen.clickContinueButton();
    }

    @Step
    public void skipLoginButton(){
        chooseTopicsScreen.skipLoginButton();
    }

    @Step
    public void selectBottomPanel(int screenNumber){
        homeScreen.selectBottomPainel(screenNumber);
    }

    @Step
    public void searchFlipBoard(String text){
        searchScreen.searchFlipBoard(text);
    }

    @Step
    public void scrollUp(int count){
        loginScreen.scrollUp(count);
    }

    @Step
    public void scrollDown(int count){
        loginScreen.scrollDown(count);
    }

    @Step
    public void verifySearchText(String text){
        Assert.assertTrue(searchScreen.verifySearchText(text));
    }

}
