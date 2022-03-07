package assignment.pathfactory.qa.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import assignment.pathfactory.com.qa.base.TestBase;
import assignment.pathfactory.qa.pages.HomeLoginPage;
import assignment.pathfactory.qa.pages.LandingPage;
import assignment.pathfactory.qa.utils.Utils;

public class HomePageTest extends TestBase {

	LandingPage landingpage;
	HomeLoginPage homeloginpage;

	public HomePageTest() throws IOException, FileNotFoundException {
		super();
	}

	@BeforeMethod
	public void setUp() throws FileNotFoundException, IOException {
		Initilization();
		homeloginpage = new HomeLoginPage();
		landingpage = new LandingPage();
		homeloginpage.ClickSignin();
	}

	@Test(priority = 1)
	public void HomePageTitleTest() {
		String title = homeloginpage.VerifyTitle();
		Assert.assertEquals(title, "Login - My Store");
	}

	@Test(priority = 2)
	public void HomepageLogoTest() {
		boolean flag = homeloginpage.VerifyLogo();
		Assert.assertTrue(flag);
	}

	@DataProvider
	public Object GetDataCorrectLogin() {
		Object data[][] = Utils.getTestData("correctlogin");
		return data;
	}

	@Test(priority = 3, dataProvider="GetDataCorrectLogin")
	public void VerifyDuplicateEmail(String email, String password) throws FileNotFoundException,
			IOException, InterruptedException {

		homeloginpage.VerifyEmailExist(email);

		Assert.assertEquals(
				homeloginpage.VerifyError(),
				"An account using this email address has already been registered. Please enter a valid password or request a new one.");
	}

	@Test(priority = 4)
	public void FieldsVisible() {
		boolean flagEmail = homeloginpage.VerifyFieldExistEmail();
		boolean flagPwd = homeloginpage.VerifyFieldExistPwd();
		Assert.assertTrue(flagEmail);
		Assert.assertTrue(flagPwd);
	}

	@Test(priority = 5)
	public void FieldsEnabled() {
		boolean flagEmail = homeloginpage.VerifyFieldEditEmail();
		boolean flagPwd = homeloginpage.VerifyFieldEditPwd();
		Assert.assertTrue(flagEmail);
		Assert.assertTrue(flagPwd);
	}

	@DataProvider
	public Object GetDataWrongLogin() {
		Object data[][] = Utils.getTestData("wronglogin");
		return data;
	}

	@Test(priority = 6)
	public void CheckPasswordInputType() {
		Assert.assertEquals(homeloginpage.FetchPassAttr(), "password");
	}

	@Test(priority = 7, dataProvider = "GetDataWrongLogin")
	public void WrongTestScenarios(String email, String password,
			String eXresult) throws FileNotFoundException, IOException,
			InterruptedException {
		landingpage = homeloginpage.NavigateLandingPage(email, password);
		Assert.assertEquals(homeloginpage.ErrorMessageDisplay(), eXresult);
	}



	@Test(priority = 8, dataProvider = "GetDataCorrectLogin")
	public void LoginFunctionality(String email, String password)
			throws FileNotFoundException, IOException, InterruptedException {
		landingpage = homeloginpage.NavigateLandingPage(email, password);
		Assert.assertEquals(landingpage.VerifyName(), true);
		landingpage.PerformSignOut();
	}

	@AfterMethod
	public void tearDown() {
		webDriver.quit();
	}

}
