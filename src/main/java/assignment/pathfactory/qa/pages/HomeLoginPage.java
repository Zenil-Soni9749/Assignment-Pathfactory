package assignment.pathfactory.qa.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import assignment.pathfactory.com.qa.base.TestBase;

public class HomeLoginPage extends TestBase{

	public HomeLoginPage() throws IOException, FileNotFoundException {
		super();
		PageFactory.initElements(webDriver, this);
	}

@FindBy(xpath="//a[@class='login']")
WebElement signin;
	
@FindBy(xpath="//div[@id='header_logo']//img")
WebElement logo;
	
@FindBy(name ="email_create")
WebElement labelCreateAcc;

@FindBy(name="SubmitCreate")
WebElement btnCreateAcc;

@FindBy(name="email")
WebElement labelLoginEmail;

@FindBy(name="passwd")
WebElement labelLoginPswd;

@FindBy(name="SubmitLogin")
WebElement btnLoginIn;

@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
WebElement forgotPwd;


@FindBy(xpath="//div[@id='create_account_error']//li")
WebElement Error;

@FindBy(xpath="//div[@class='alert alert-danger']/ol/li")
WebElement errorMsg;

@FindBy(id = "email")
WebElement emailInputfield;

@FindBy(xpath = "//label[contains(text(),'Password')]")
WebElement pwdInputfield;

public void ClickSignin()
{
	signin.click();
}

public String VerifyTitle()
{
	return webDriver.getTitle();
}

public boolean VerifyLogo()
{
 return logo.isDisplayed();
}

public void VerifyEmailExist(String uname)
{
	labelCreateAcc.sendKeys(uname);
	btnCreateAcc.click();
}

public String VerifyError()
{
	return Error.getText();
}

public boolean VerifyFieldExistEmail()
{
	return emailInputfield.isDisplayed();
}

public boolean VerifyFieldExistPwd()
{
	return pwdInputfield.isDisplayed();
}

public String ErrorMessageDisplay(){
	return errorMsg.getText();
}

public boolean VerifyFieldEditEmail()
{
	return emailInputfield.isEnabled();
}

public boolean VerifyFieldEditPwd()
{
	return pwdInputfield.isEnabled();
}


public LandingPage NavigateLandingPage(String uname, String pwd) throws FileNotFoundException, IOException{
labelLoginEmail.sendKeys(uname);	
labelLoginPswd.sendKeys(pwd);
btnLoginIn.click();
return new LandingPage();
}

public String FetchPassAttr()
{
	return labelLoginPswd.getAttribute("type").toString();
}

public void ClickFPwd()
{
	forgotPwd.click();
}
}
