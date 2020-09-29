package PHPTravels;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTest extends BaseTest{
	
	SignUpPage signup;
	@Test
	public void verifySignUpPage() {
		signup=PageFactory.initElements(browser, SignUpPage.class);
		signup.signUp("Sam","Fox");
		Assert.assertEquals(signup.getNameText(),"Hi,"+""+signup.firstName+""+signup.lastName);	
	}
}
