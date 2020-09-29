package AutomationSample.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPracticeTest {
	

    @BeforeTest(enabled = false)
    public void beforeTest() {
	System.out.println("Before test method executed");
    }

    @AfterTest(enabled = false)
    public void afterTest() {
	System.out.println("After test method executed");
    }
    
	@Test(enabled = false)
	public void testcaseOne() {
		System.out.println("test case one executed");
		Assert.assertTrue(true);
	}
	
	@Test(enabled = false)
	public void testcaseTwo() {
		System.out.println("test case two executed");
		Assert.assertEquals(true, true);
	}
	
	@Test(enabled = false)
	public void testcaseThree() {
		System.out.println("test case three executed");
		
	}
	
	@Test(enabled = false)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("executed");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
}


