import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class SimulatorTest {

    @Test
    public void luncher() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName",    "XCUITest");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "12.1");
        capabilities.setCapability("deviceName", "iPad Air 2");
        //  capabilities.setCapability("bundleId", "com.apple.reminders");
        /* Below capability must be uncommented for /AppiumTest job */
         //  capabilities.setCapability("app", "/Users/travis/build/nsilvestre/appiumTest/ToDoList/builddata/Build/Products/Release-iphonesimulator/ToDoList.app");
        /* Below capability must be uncommented for /ToDoList job */
        capabilities.setCapability("app", "/Users/travis/build/nsilvestre/ToDoList/builddata/Build/Products/Release-iphonesimulator/ToDoList.app");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("useNewWDA", "false");


        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        IOSDriver driver = new IOSDriver(url, capabilities);


        driver.closeApp();
        driver.launchApp();
        /*
        System.out.println("test reminder");
        IOSElement add = (IOSElement) driver.findElementByAccessibilityId("Add List");
        add.click();
        */

        System.out.println("Testing travis integration - Adding os: osx");

    }
}
