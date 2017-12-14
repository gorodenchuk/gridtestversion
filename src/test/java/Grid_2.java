
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_2 {

    WebDriver webDriver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazar_Gorodenchuk\\Desktop\\selenium\\src\\main\\resources\\resources\\chrome-win\\chromedriver.exe");
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\gorod\\workspace\\patternsdemo\\src\\main\\java\\resources\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
//        capabilities.setBrowserName("firefox");
//        capabilities.setPlatform(Platform.WIN10);
        WebDriver driver = new FirefoxDriver(capabilities);
//        webDriver = new RemoteWebDriver(new URL("http://10.25.165.180:5566"), capabilities);
    }

//    @AfterTest
//    public void afterTest() {
//        webDriver.quit();
//    }

    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\gorod\\workspace\\patternsdemo\\src\\main\\java\\resources\\geckodriver.exe");
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
//        WebDriver webDriver = new FirefoxDriver(capabilities);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gorod\\workspace\\gridtestversion\\src\\main\\resources\\resources\\chrome-win\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Test-type");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("marionette", true);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver webDriver = new ChromeDriver(capabilities);


        Wait<WebDriver> wait = new WebDriverWait(webDriver, 3000);
        webDriver.get("http://newtours.demoaut.com/");
        Assert.assertEquals("Welcome: Mercury Tours", webDriver.getTitle());
        webDriver.quit();
    }



}
