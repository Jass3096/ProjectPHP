package PHPTravels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(css="div.dropdown.dropdown-login.dropdown-tab >a")
	protected WebElement myAccount;
	
	@FindBy(css="div.dropdown-menu.dropdown-menu-right.show > div >a:nth-child(1)")
	protected WebElement login;
	
	@FindBy(css="input[name='username']")
	protected WebElement email;
	
	@FindBy(css="input[name='password']")
	protected WebElement password;
	
	@FindBy(css="button.btn.btn-primary.btn-lg.btn-block.loginbtn")
	protected WebElement loginbutton;
	
	@FindBy(css="h3.text-align-left")
	protected WebElement nameText;
	
	public void Login() {
		myAccount.click();
		login.click();
		email.sendKeys("user@phptravels.com");
		password.sendKeys("demouser");
		loginbutton.click();
	}
	
	public String getNameText() {
		return nameText.getText();
	}
}

