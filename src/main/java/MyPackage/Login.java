package MyPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= ".//*[@id='userAccountLink'] ")
	WebElement yourtrips;
	
	@FindBy(id = "SignIn")
	WebElement signIn;
	
	@FindBy(id = "signInButton")
	WebElement signInButton;
	
	/*@FindBy(id = "signinForm")
	WebElement clickSignInForm;*/
	
	@FindBy(id = "errors1")
	WebElement popUpError;
	
	@FindBy(id = "close")
	WebElement closePopUp;
	
	
	public WebElement yourtrips() 
	{
		return yourtrips;
	}
	public WebElement signIn()
	{
		return signIn;
	}
	/*public WebElement clickSignInForm()
	{
		return clickSignInForm;
	}*/
	public WebElement signInButton() 
	{
		return signInButton;
	}
	public WebElement popUpError() 
	{
		return popUpError;
	}
	public WebElement closePopUp() 
	{
		return closePopUp;
	}
}
