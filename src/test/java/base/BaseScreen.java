package base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class BaseScreen extends PageObject {

    public void enter() {
        ((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void scrollUp(int howManySwipes) {
        AndroidDriver androidDriver = ((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());
        Dimension size = androidDriver.manage().window().getSize();

        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.8);
        int endVerticalY = (int) (size.height * 0.21);
        int startVerticalX = (int) (size.width / 2.1);
        try {
            for (int i = 1; i <= howManySwipes; i++) {

                new TouchAction(((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver()))
                        .press(PointOption.point(startVerticalX, startVerticalY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                        .moveTo(PointOption.point(startVerticalX, endVerticalY)).release().perform();
            }
        } catch (Exception e) {
            // print error or something
        }

    }

    public void scrollDown(int howManySwipes) {
        AndroidDriver androidDriver = ((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());
        Dimension size = androidDriver.manage().window().getSize();

        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.8);
        int endVerticalY = (int) (size.height * 0.21);
        int startVerticalX = (int) (size.width / 2.1);
        try {
            for (int i = 1; i <= howManySwipes; i++) {
                new TouchAction(((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver()))
                        .press(PointOption.point(startVerticalX, endVerticalY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                        .moveTo(PointOption.point(startVerticalX, startVerticalY)).release().perform();
            }
        } catch (Exception e) {
            // print error or something
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
