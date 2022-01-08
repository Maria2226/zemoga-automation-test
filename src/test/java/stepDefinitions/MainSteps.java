package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import config.BaseConfig;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class MainSteps {

    BaseConfig connectionConfig;

    @Given("User open automationpractice")
    public void openAutomationPractice() {
        connectionConfig = new BaseConfig();
        connectionConfig.open(false);
    }

    @Given("User open automationpractice in a mobile device")
    public void openAutomationPracticeInMobileDevice() {
        connectionConfig = new BaseConfig();
        connectionConfig.open(true);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) BaseConfig.driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failure screenshot");

        }
        connectionConfig.close();
    }
}


