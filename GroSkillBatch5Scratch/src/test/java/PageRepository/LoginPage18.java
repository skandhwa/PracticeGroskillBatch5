package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage18 extends BaseClass {
	
	WebDriver driver;
	
	public LoginPage18(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement uname;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login_Btn;
	
	
	public void enterUserName(String username)
	{
		uname.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		pwd.sendKeys(password);
	}
	
	
	public void clickLogin()
	{
		login_Btn.click();
	}
	
	

}
