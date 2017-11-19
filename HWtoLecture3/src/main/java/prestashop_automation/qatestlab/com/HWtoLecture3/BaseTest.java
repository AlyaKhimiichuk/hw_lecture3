package prestashop_automation.qatestlab.com.HWtoLecture3;


//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import utilities.Properties;


public class BaseTest {
	private static WebDriver getDriver() {
		String browser = Properties.getBrowser();
		
		if (browser == "firefox") {
			//
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			return new FirefoxDriver();}
			
		else if (browser == "ie") {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/IEDServeer.exe");
			return new InternetExplorerDriver();}
			
		else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
//			System.setProperty("webdriver.chrome.driver", new File(BaseTest.class.getResource("/chrome.driver.exe").getFile()).getPath());
			return new ChromeDriver();
			
		}	
		
		
	}

	
	public static EventFiringWebDriver getConfigureDriver() {
		WebDriver driver = getDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		EventFiringWebDriver webDriver = new EventFiringWebDriver(driver);
		webDriver.register(new EventHandler());
		return webDriver;
	}
	
	public static void quiteDriver(WebDriver driver) {
		driver.quit();
	}

}
