package dm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    public static Properties props= new Properties();



        public static WebDriver launchBrowser(String browserName) {
            switch (browserName.toLowerCase()) {
                case ("firefox"): {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.get("https://www.dm.gov.ae/");
                    break;
                }
                case ("edge"):{
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    driver.get("https://www.dm.gov.ae/");
                    break;
                }


            }
            return driver;
        }}




