package main_classes;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Deepthi\\eclipse-workspace\\adactinproject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Deepthi\\eclipse-workspace\\adactinproject\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("enter the valid browser");
		}
		driver.manage().window().maximize();
		return driver;
}
	
	public static void getUrl(String url) {
		driver.get(url);
}
	public static void Navigate(String navigateOption) {
		if(navigateOption.equalsIgnoreCase("forward")) {
			
			driver.navigate().forward();
			}else if(navigateOption.equalsIgnoreCase("back")) {
				driver.navigate().back();
			}else {
				System.out.println("invalid input");
			}
		
		}
	public static void refreshOption() {
		driver.navigate().refresh();
}
	public static void currentUrl() {
		
		driver.getCurrentUrl();
}
	public static void getTitle() {
		driver.getTitle();

	}
	public static void windowHandle() {
		String windowHandle = driver.getWindowHandle();
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println(title);
		}
	public static void windowHandles() {
		Set<String> handles = driver.getWindowHandles();
		for (String str : handles) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
			}
		}
	
	public static void alertMethod(String options) {
		if(options.equalsIgnoreCase("accept")) {
			
		driver.switchTo().alert().accept();
		
		}else if(options.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
		
		}
	public static void screenCapture(String ph) throws IOException {
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Deepthi\\eclipse-workspace\\adactinproject\\screenshots\\"+ph+".png");
        FileUtils.copyFile(src, des);
	}
	
	public static void checkMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		}
	
	public static void checkEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
}
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
}
	public static void clearOption(WebElement element) {
		element.clear();
}
	public static void closeOption() {
		driver.close();
	}
	public static void quitOption() {
		driver.quit();
}
	public static void singleDropdown(WebElement element, String options, String values) {
		Select s = new Select(element);
		if(options.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(values);
			s.selectByIndex(index);
					}else if(options.equalsIgnoreCase("value")){
						s.selectByValue(values);
						
					}else if(options.equalsIgnoreCase("text")) {
						s.selectByVisibleText(values);
					}else if (options.equalsIgnoreCase("allOptions")) {
						List<WebElement> opt = s.getOptions();
						for (WebElement op : opt) {
							System.out.println(op.getText());
							}
					}else {
						System.out.println("enter valid option");
					}

	}
	public static void multipleDropdown(WebElement element,String options,String values) {
		Select s = new Select(element);
		if(options.equalsIgnoreCase("getAllSelected")) {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement sel : allSelectedOptions) {
				String text = sel.getText();
				System.out.println(text);
				
			}
		}else if(options.equalsIgnoreCase("getFirstSelected")) {
			 WebElement first = s.getFirstSelectedOption();
			System.out.println(first.getText());
		}else if(options.equalsIgnoreCase("deselectAll")) {
			s.deselectAll();
		}else if(options.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(values);
			s.deselectByIndex(index);
		}else if(options.equalsIgnoreCase("value")) {
			s.deselectByValue(values);
		
		}else if (options.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(values);
		}else if(options.equalsIgnoreCase("grtOptions")) {
			List<WebElement> options2 = s.getOptions();
			for (WebElement opt2 : options2) {
				String txt = opt2.getText();
				System.out.println(txt);
			}
		}else {
			System.out.println("invalid option");
		}

	}
	public static void explicitwaitOption(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(element));
		}
	public static void implicitwaitOption() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
}
	public static void Frame(WebElement element) {
		driver.switchTo().frame(element);
}
	public void Frame(int index) {
		driver.switchTo().frame(index);
}
	public static void parentFrame(WebElement element) {
		driver.switchTo().parentFrame();
}
	public static void defaultContent() {
		driver.switchTo().defaultContent();

	}
	
	public static void dragandDrop(WebElement source,WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
		}
	public static void rightClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
}
	public static void movetoElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
}
	public static void sendValues(WebElement element,String value) {
		element.sendKeys(value);

	}
	
//	public base(WebDriver driver) {
//		this.driver = driver;
//				
//		
//	}
	
	

}
