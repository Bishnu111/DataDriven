package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Addcontactpage;
import page.Techfios_homepage;
import page.Techfios_login;
import reader.ReadData;
import util.BrowserFactory;

public class Addcontacttest {
ReadData readExcelData = new ReadData();

        String Username;
        String Password; 
		String Fullname ;
		String CompanyName;
		String Email;
		String Phone;
		String Address;
		String City;
		String State;
		String Zipcode;
		
		public Addcontacttest() throws IOException{
			
			String userdata[][]= readExcelData.getLogInDataFromExcelFile();	
			for(int j=1; j<userdata.length;j++)
				
			{
				
				Username=userdata[j][0];
				Password=userdata[j][1];
				Fullname = userdata[j][9];
				CompanyName = userdata[j][10];
				Email = userdata[j][11];
				Phone= userdata[j][12];
				Address= userdata[j][13];
				City= userdata[j][14];
				State= userdata[j][15];
				Zipcode= userdata [j][16];
		    }		
		}
			
		@Test
		public void TechfiosTest() throws IOException{
			
			WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
			
			Techfios_login login = PageFactory.initElements(driver, Techfios_login.class);
			login.login_techfios(Username, Password);
			
			Techfios_homepage click = PageFactory.initElements(driver, Techfios_homepage.class);		
			click.click_Account();
		
			Addcontactpage contact = PageFactory.initElements(driver, Addcontactpage.class);	
			contact.Addcontact(Fullname, CompanyName, Email, Phone, Address, City, State, Zipcode);
			
			
			
			
			driver.close();
			driver.quit();
		}
	}


	
	
	
	
	
	
	
	
	

