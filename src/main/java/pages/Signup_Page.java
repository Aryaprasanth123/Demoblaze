package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_Page {
	public WebDriver driver;
	public Signup_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Sign up']") WebElement signuptitle;
	@FindBy(id="sign-username") WebElement usernamesign;
	@FindBy(id="sign-password") WebElement passwordsign;
	@FindBy(xpath="//button[text()='Sign up']") WebElement signupbtn;
}
