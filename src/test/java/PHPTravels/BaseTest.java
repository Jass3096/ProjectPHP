package PHPTravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected static WebDriver browser=null;
	protected WebDriverWait wdWait;
	@BeforeTest
	public void openPHPTravels() {
		
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();

        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.manage().window().maximize();

        wdWait = new WebDriverWait(browser, 30);

        browser.get("https://www.phptravels.net/");
	}
}
