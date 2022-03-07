package assignment.pathfactory.com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import assignment.pathfactory.qa.utils.Utils;


public class TestBase {

	
	public static WebDriver webDriver;
	public static Properties configProp;

	public TestBase() throws IOException, FileNotFoundException {
		configProp = new Properties();
		FileInputStream fps = new FileInputStream(
				Utils.SYSTEM_DIR+"\\src\\main\\java\\assignment\\pathfactory\\qa\\config\\config.properties");
		configProp.load(fps);

	}

	public void Initilization() {
		String chromeBrowser = configProp.getProperty("BROWSER_TYPE");

		String chromePath = Utils.SYSTEM_DIR
				+ configProp.getProperty("BROWSER_CHROME_PATH");
		String ffPath = Utils.SYSTEM_DIR + configProp.getProperty("BROWSER_FF_PATH");

		if (chromeBrowser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", chromePath);

			webDriver = new ChromeDriver();
		}

		else if (chromeBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ffPath);

			webDriver = new FirefoxDriver();
		}
		webDriver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		webDriver.get(configProp.getProperty("BASE_URI"));
	}

}
