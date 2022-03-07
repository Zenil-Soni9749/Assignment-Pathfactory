package assignment.pathfactory.qa.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import assignment.pathfactory.com.qa.base.TestBase;

public class LandingPage extends TestBase{

	public LandingPage() throws IOException, FileNotFoundException {
		super();
PageFactory.initElements(webDriver, this);
	}
	@FindBy(xpath="//a[@class='account']//span")
	WebElement uname;
	
	@FindBy(xpath="//a[@class='logout']")
	WebElement btnSignout;
	
	public boolean VerifyName(){
		return uname.isDisplayed();
	}
	
	public void PerformSignOut()
	{
		btnSignout.click();
	}
}
