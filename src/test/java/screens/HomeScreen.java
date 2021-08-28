package screens;

import base.BaseScreen;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class HomeScreen extends BaseScreen {

    @AndroidFindBy(id = "flipboard.app:id/bottom_nav_view_icon")
    public List<AndroidElement> bottomNavigation;

    public void selectBottomPainel(int screenNumber){
        bottomNavigation.get(screenNumber-1).click();
    }
}
