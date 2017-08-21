
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class SampleFirefox {

    WebDriver driver;

    @Test
    public void testSample(){

      // System.setProperty("phantomjs.binary.path","D:\\Works\\lib\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");

        //System.setProperty("phantomjs.binary.path","D:\\Works\\lib\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
      // driver = new PhantomJSDriver();

       // System.setProperty("webdriver.chrome.driver","D:\\Works\\lib\\chromedriver.exe");

       // DesiredCapabilities cap=new DesiredCapabilities();
       // cap.setCapability("firefox_binary", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();


       // driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        System.out.println("Page Title: "+ driver.getTitle());

        Assert.assertEquals("Google",  driver.getTitle());

        driver.close();

        driver.quit();


    }


}
