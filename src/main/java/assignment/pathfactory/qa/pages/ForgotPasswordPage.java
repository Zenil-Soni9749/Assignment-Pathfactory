package assignment.pathfactory.qa.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import assignment.pathfactory.com.qa.base.TestBase;

import com.relevantcodes.extentreports.model.Test;

public class ForgotPasswordPage extends TestBase {

	public ForgotPasswordPage() throws IOException, FileNotFoundException {
		super();
		PageFactory.initElements(webDriver, this);
	}
	
	public String GetTitle()
	{
		return webDriver.getTitle();
	}
	
	@FindBy(id = "email")
	WebElement emailInputfield;
	
	public boolean VerifyFieldExistEmail()
	{
		return emailInputfield.isDisplayed();
	}
}
