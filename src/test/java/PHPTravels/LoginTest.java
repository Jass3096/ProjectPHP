package PHPTravels;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PHPTravels.Login;
import PHPTravels.SignUpPage;

public class LoginTest extends BaseTest {

	Login login;
	SignUpPage signup;
	@Test
	public void verifyLogin() {
		login=PageFactory.initElements(browser, Login.class);
		login.Login();
		Assert.assertEquals(login.getNameText(),"Hi, Demo User");	

	}
}
