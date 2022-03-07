package assignment.pathfactory.qa.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import assignment.pathfactory.com.qa.base.TestBase;
import assignment.pathfactory.qa.pages.ForgotPasswordPage;
import assignment.pathfactory.qa.pages.HomeLoginPage;

public class ForgotPasswordTest extends TestBase{

	public ForgotPasswordTest() throws IOException, FileNotFoundException {
		super();
	}
	HomeLoginPage homeloginpage;
	ForgotPasswordPage forgot;
	@BeforeMethod
	public void setUp() throws FileNotFoundException, IOException
	{
		Initilization();
		forgot = new ForgotPasswordPage();
		homeloginpage = new HomeLoginPage();
		homeloginpage.ClickSignin();
		homeloginpage.ClickFPwd();
	}
	
	@Test(priority=13)
	public void VerifyTitle()
	{
		Assert.assertEquals(forgot.GetTitle(), "Forgot your password - My Store");
	}
	
	@Test(priority=14)
	public void FieldVisible(){
		boolean flagEmail = homeloginpage.VerifyFieldExistEmail();
		Assert.assertTrue(flagEmail);
	}
	
	@AfterMethod
	public void tearDown()
	{
		webDriver.quit();
	}
}
