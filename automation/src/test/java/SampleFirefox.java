
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

        System.setProperty("webdriver.chrome.driver","D:\\Works\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");

        System.out.println("Page Title: "+ driver.getTitle());

        Assert.assertEquals("Google",  driver.getTitle());

        driver.close();

        driver.quit();


    }


}
