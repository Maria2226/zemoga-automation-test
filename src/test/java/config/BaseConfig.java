package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static constants.Properties.BASE_URL;

public class BaseConfig {

    public static WebDriver driver;

    public void open(boolean isMobile)  {
        try {
            System.setProperty("webdriver.chrome.driver",new File("./drivers/chromedriver").getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Nexus 5");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        if(isMobile){
            driver = new ChromeDriver(chromeOptions);
        }else{
            driver = new ChromeDriver();
        }
        driver.get(BASE_URL);
        if(!isMobile){
            driver.manage().window().maximize();
        }
    }
    public void close()  {
        driver.close();
    }
}
