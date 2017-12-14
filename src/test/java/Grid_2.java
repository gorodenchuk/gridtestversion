
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_2 {

    WebDriver webDriver;

    @BeforeTest
    public void setUp() throws MalformedURLException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazar_Gorodenchuk\\Desktop\\selenium\\src\\main\\resources\\resources\\chrome-win\\chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WIN10);
        webDriver = new RemoteWebDriver(new URL("http://10.25.14.48:5566"), capabilities);
    }

    @AfterTest
    public void afterTest() {
        webDriver.quit();
    }

    @Test
    public void simpleTest() {
        webDriver.get("http://newtours.demoaut.com/");
        Assert.assertEquals("Welcome: Mercury Tours", webDriver.getTitle());
    }

}
