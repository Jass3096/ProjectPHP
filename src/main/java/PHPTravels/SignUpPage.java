package PHPTravels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Base{
	
	@FindBy(css="div.dropdown.dropdown-login.dropdown-tab >a")
	protected WebElement myAccount;
	
	@FindBy(css="div.dropdown-menu.dropdown-menu-right.show > div >a:nth-child(2)")
	protected WebElement signUp;
	
	@FindBy(name="firstname")
	protected WebElement firstName;
	
	@FindBy(name="lastname")
	protected WebElement lastName;
	
	@FindBy(name="phone")
	protected WebElement phone;
	
	@FindBy(name="email")
	protected WebElement email;
	
	@FindBy(name="password")
	protected WebElement password;
	
	@FindBy(name="confirmpassword")
	protected WebElement confirmPassword;
	
	@FindBy(css="button[class='signupbtn btn_full btn btn-success btn-block btn-lg']")
	protected WebElement signUpButton;
	
	@FindBy(css="text-align-left")
	protected WebElement nameText;

	@FindBy(css="button.cc-btn.cc-dismiss")
	protected WebElement cookiesmsg;
	
	public void signUp(String firstName, String lastName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myAccount.click();
		signUp.click();
		this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        phone.sendKeys("4444333221");
        email.sendKeys("samfox@gmail.com");
        password.sendKeys("123456");
        confirmPassword.sendKeys("123456");
        cookiesmsg.click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //js.executeScript("arguments[0].scrollIntoView();", signUpButton);
        js.executeScript(
				"document.querySelectorAll('button[class='signupbtn btn_full btn btn-success btn-block btn-lg']')[0].scrollIntoView()");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("scroll until vivible btn");
        signUpButton.click();
	}
	
	public String getNameText() {
		return nameText.getText();
	}
}
