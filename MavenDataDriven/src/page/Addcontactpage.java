package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Addcontactpage {

WebDriver driver;
	
	public Addcontactpage (WebDriver ldriver){
		
		this.driver=ldriver;
	}	
	
	@FindBy(how=How.ID,using="account")
	WebElement Fullname;
	
	@FindBy(how=How.ID,using="company")
	WebElement CompanyName;
	
	@FindBy(how=How.ID, using="email")
	WebElement Email;
	
	@FindBy(how=How.ID,using="phone")
	WebElement Phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement Address;
	
	@FindBy(how=How.ID, using="city")
	WebElement City;
	
	@FindBy(how=How.ID,using="state")
	WebElement State;
	
	@FindBy(how=How.ID,using="zip")
	WebElement Zipcode;
	
	@FindBy(how=How.ID,using="submit")
	WebElement Submit;
	
	
public void Addcontact(String name,String CoName,String Emailadd, String Phoneno, String  Add, String city, String States, String zipcode){
		
		Fullname.sendKeys(name);
		CompanyName.sendKeys(CoName);
		Email.sendKeys(Emailadd);
		Phone.sendKeys(Phoneno);
		Address.sendKeys(Add);
		City.sendKeys(city);
		State.sendKeys(States);
		Zipcode.sendKeys(zipcode);
		
		Submit.click();	
}
	
}
