package AdacRunnerClass;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import main_classes.base;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Deepthi\\eclipse-workspace\\adactinproject\\src\\test\\java\\featurefile\\adacFeatureFile.feature", 
glue = "adacStepDefine",
plugin= {"pretty",
		"html:Report/Cucumber_Html_Report",
		"json:Report/Cucumber_json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Cucumber_Extent_report.html"},
		monochrome  = true)

public class runnerAdactin {
	public static WebDriver driver;

	@org.junit.BeforeClass
	public static void setUp() {

		driver = base.browserLaunch("chrome");

	}

	@org.junit.AfterClass
	public static void closeMeth() {
		 driver.quit();

	}

}
