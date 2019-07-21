package desiredCapability;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapability {
	
	public static WebDriver wd;
	
	public WebDriver getdriver() {
		//  Auto-generated method stub
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ch.setPageLoadStrategy(PageLoadStrategy.NONE);
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		wd=new ChromeDriver(ch);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		//E:\\chromedriver.exe
		return wd;
	}

}
