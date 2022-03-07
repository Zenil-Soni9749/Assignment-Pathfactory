package assignment.pathfactory.qa.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import assignment.pathfactory.com.qa.base.TestBase;

public class SignUpPage extends TestBase{

	public SignUpPage() throws IOException, FileNotFoundException {
		super();
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id="uniform-id_gender1")
	WebElement radioBtn;
	
	@FindBy(name="customer_firstname")
	WebElement labelFirstName;
	
	@FindBy(name="customer_lastname")
	WebElement labelLastName;
	
	@FindBy(id="email")
	WebElement labelEmail;
	
	@FindBy(name="passwd")
	WebElement labelPassword;
	
	@FindBy(id="days")
	WebElement labelDays;
	
	@FindBy(id="months")
	WebElement labelMonths;
	
	@FindBy(id="years")
	WebElement labelYear;
	
	@FindBy(name="address1")
	WebElement labelAddress;
	
	@FindBy(name="city")
	WebElement labelCity;
	
	@FindBy(name="id_state")
	WebElement labelState;
	
	@FindBy(name="postcode")
	WebElement labelPostal;
	
	@FindBy(name="id_country")
	WebElement labelCountry;
	
	@FindBy(name="phone_mobile")
	WebElement labelMobilePhone;
		
	@FindBy(name="firstname")
	WebElement validatefname;
	
	@FindBy(name="lastname")
	WebElement validateLname;
	
	@FindBy(name="submitAccount")
	WebElement btnSubmitForm;
	
	public void SelectTitle()
	{
	 radioBtn.click();	
	}
	
	public void EnterFname()
	{
		labelFirstName.sendKeys("RAJ");
	}
	public void EnterLname()
	{
		labelFirstName.sendKeys("PATEL");
	}
	
	public String FetchEmail()
	{
		return labelEmail.getText();
	}
	
	//Enter BDate
	
	public void EnterDays()
	{
		Select days = new Select(labelDays);
		days.selectByVisibleText("1");
	}
	
	public void EnterAddress(){
		labelAddress.sendKeys("Three Notch Old Rolling Road");
	}
	
	public void EnterCity()
	{
		labelCity.sendKeys("California");
	}
	
	//Enter State
	public void EnterPostal()
	{
		labelPostal.sendKeys("20619");
	}
	
	//Enter Country
	
	public void EnterPhone()
	{
		labelMobilePhone.sendKeys("6478030702");
	}
	
	public void FetchFname()
	{
		validatefname.getText();
	}
	
	public void FetchLname()
	{
		validateLname.getText();
	}
	
	public void RegisterForm()
	{
		btnSubmitForm.click();
	}
}