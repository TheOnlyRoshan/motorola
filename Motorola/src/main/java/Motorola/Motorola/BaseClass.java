package Motorola.Motorola;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	String URL = null;
	WebDriver driver;
	Properties propfile1 = new Properties();
	
	@BeforeMethod
	public void setupConnection() throws IOException {
	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/seleniumdriver/chromedriver.exe");
		driver = new ChromeDriver();
        String propPath1 = System.getProperty("user.dir") + "/src/main/java/master/config.properties";
		
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(propPath1);
		propfile1.load(fis);
		URL = propfile1.getProperty("URL");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.navigate().to(URL);

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		
	}
	@AfterMethod
	public void aftermethod()
	{
		driver.quit();
	}
	
	// Method to wait till element clickable
		public static void elementClickable(WebDriver driver, WebElement locator, int timeout) {
			try {
				new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(locator));
			} catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException
					| org.openqa.selenium.TimeoutException e) {
			}
		}

		// Method to wait till element visible
		public static void elementVisibility(WebDriver driver, WebElement locator, int timeout) 
		{
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locator));
		}
}
