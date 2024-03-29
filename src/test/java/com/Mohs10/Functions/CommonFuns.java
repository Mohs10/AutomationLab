package com.Mohs10.Functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Mohs10.Base.Action;
import com.Mohs10.Base.StartBrowser;
//import com.Mohs10.OR.HomePage;
import com.Mohs10.OR.PharmacySuperadminPage;



public class CommonFuns {

	public Action aDriver;
	public WebDriver driver;

	public CommonFuns() {
		aDriver = new Action();
		driver = StartBrowser.driver;
	}

	
	
	public void MamatvaLogin(String Memailid,String Mpwd, String Location)throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to the Mamatva application");
		aDriver.navigateToApplication("http://mamatva.ap-south-1.elasticbeanstalk.com/");
		Thread.sleep(4000);
		
		//, String Location
		
		aDriver.type(PharmacySuperadminPage.Memailid, Memailid,"Enter the emailid");
		Thread.sleep(2000);
		
		aDriver.type(PharmacySuperadminPage.Mpwd, Mpwd,"Enter the emailid");
		Thread.sleep(2000);
		
		aDriver.click(PharmacySuperadminPage.Mloginbtn, "Click on the Login Button");
		Thread.sleep(2000);
		
		aDriver.click(PharmacySuperadminPage.AddLocation, "Click on the Login Button");
		Thread.sleep(2000);
		
		//WebElement button = driver.findElement(PharmacySuperadminPage.AddLocation);

		aDriver.type(PharmacySuperadminPage.Locationfill, Location, "Click on the Login Button");
		Thread.sleep(2000);
		
		aDriver.click(PharmacySuperadminPage.submitbtn, "Click on the Login Button");
		Thread.sleep(2000); 
		
		aDriver.click(PharmacySuperadminPage.Confirmadd,"Click on the confirm add");
		
		/*WebElement button = driver.findElement(PharmacySuperadminPage.submitbtn);

		JavascriptExecutor ja = (JavascriptExecutor) driver;
        aDriver.scrollByVisibilityOfElement(driver, button);
		ja.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);

		ja.executeScript("arguments[0].click();", button);
		System.out.println("Submit the Location");
		Thread.sleep(3000);
		
		
		
		/*aDriver.click(PharmacySuperadminPage.Delete,"Enter the emailid");
		Thread.sleep(2000);
		
		
		aDriver.click(PharmacySuperadminPage.Dltoption,"Enter the emailid");
		Thread.sleep(2000);*/
		
		
		
		/*aDriver.click(PharmacySuperadminPage.User,"Enter the emailid");
		Thread.sleep(2000);
		
		aDriver.click(PharmacySuperadminPage.Edituser,"Enter the emailid");
		Thread.sleep(2000);
		
		//aDriver.clear(PharmacySuperadminPage.dltuser,"Enter the emailid");
		//Thread.sleep(2000);
		
		
		aDriver.type(PharmacySuperadminPage.Username, Username,"Enter the emailid");
		Thread.sleep(2000);*/
		
		//WebElement button = driver.findElement(PharmacySuperadminPage.Submitbtn);

		 

		/*JavascriptExecutor ja = (JavascriptExecutor) driver;
        aDriver.scrollByVisibilityOfElement(driver, button);
		ja.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);

		ja.executeScript("arguments[0].click();", button);
		System.out.println("clicked on Submit button");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		/*aDriver.click(PharmacySuperadminPage.AddAdmin, "Click on the Login Button");
		Thread.sleep(2000);
		aDriver.type(PharmacySuperadminPage.Name,AdminName, "Click on the Login Button");
		Thread.sleep(2000);
		aDriver.type(PharmacySuperadminPage.Location,Location, "Click on the Login Button");
		Thread.sleep(2000);
		aDriver.type(PharmacySuperadminPage.emailid,Emailid, "Click on the Login Button");
		Thread.sleep(2000);
		aDriver.type(PharmacySuperadminPage.pwd,Password, "Click on the Login Button");
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(PharmacySuperadminPage.checkbox);

		 

		JavascriptExecutor ja = (JavascriptExecutor) driver;
        aDriver.scrollByVisibilityOfElement(driver, button);
		ja.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		ja.executeScript("arguments[0].click();", button);
		System.out.println("clicked on Checkbox");
		Thread.sleep(3000);
		
		
		//aDriver.click(PharmacySuperadminPage.checkbox, "Click on the Login Button");
		//Thread.sleep(2000);
		
		aDriver.click(PharmacySuperadminPage.submitbtn, "Click on the Login Button");
		Thread.sleep(2000);
		
		aDriver.click(PharmacySuperadminPage.Regsuccess, "Click on the Login Button");
		Thread.sleep(2000);*/
		
		aDriver.click(PharmacySuperadminPage.MLogout, "Click on the Logout Button");
		Thread.sleep(2000);
		aDriver.click(PharmacySuperadminPage.MSignout, "Click on the Signout Button");
		Thread.sleep(2000);
	}
		
		public void VerifyingWebsiteTitle() {
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Verifying the Title of the Application");
			aDriver.navigateToApplication("http://mamatva.ap-south-1.elasticbeanstalk.com/");

			String actualTitle = driver.getTitle();
			String expTitle = "Mamatva";

			if (actualTitle.equalsIgnoreCase(expTitle)) {

				System.out.println("Verified Title : Test Passed   " + actualTitle);
			} else {
				System.out.println("Title Not Matched : Test Failed" + expTitle);
			}
		}
		
		
		
		
	
		
	
	
	
	
	
	/*public void Login(String emailid,String password)throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to the Pharmacy application");
		aDriver.navigateToApplication("http://jyotsna-pharmacy.eba-azzpankg.ap-south-1.elasticbeanstalk.com/login");
		Thread.sleep(4000);
		
		aDriver.type(PharmacySuperadminPage.emailid, emailid, "Enter the emailid");
		Thread.sleep(4000);
		aDriver.type(PharmacySuperadminPage.pwd, password, "Enter the password");
		Thread.sleep(2000);
		aDriver.click(PharmacySuperadminPage.loginbtn, "Click on the Login Button");
		Thread.sleep(2000);
		aDriver.click(PharmacySuperadminPage.Pharmacy, "Pharmacy Logo");
}

	
	
	/*public void AddSupplier(String SName, String ContactNumber, String Email, String GSTNumber, String Email1)throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Add New Supplier");
		aDriver.navigateToApplication("http://jyotsna-pharmacy.eba-azzpankg.ap-south-1.elasticbeanstalk.com/login");
	
		aDriver.click(PharmacySuperadminPage.supplier,  "Click on the Supplier section");
		Thread.sleep(2000);
		aDriver.click(PharmacySuperadminPage.Addsupplier, "Click on the Add supplier");
		Thread.sleep(2000);
	    aDriver.type(PharmacySuperadminPage.SName, SName, "Enter the Supplier Name");
	    Thread.sleep(2000);
		aDriver.type(PharmacySuperadminPage.CntctNum, ContactNumber, "Enter the Contact number");
		Thread.sleep(2000);
		aDriver.type(PharmacySuperadminPage.Email, Email, "Enter the supplieremail");
		Thread.sleep(2000);
		aDriver.type(PharmacySuperadminPage.GSTNum, GSTNumber, "Enter the GST Number");
		Thread.sleep(2000);
        aDriver.click(PharmacySuperadminPage.SaveDet, "Enter the emailid");
        Thread.sleep(2000);
        
        aDriver.click(PharmacySuperadminPage.ViewDetails, "");
		Thread.sleep(2000);
		aDriver.click(PharmacySuperadminPage.EditDetails, "");
		Thread.sleep(2000);
		aDriver.type(PharmacySuperadminPage.Email1, Email1, "");
		Thread.sleep(2000);
		aDriver.click(PharmacySuperadminPage.SaveDetails, "");
		Thread.sleep(2000);
        
		aDriver.click(PharmacySuperadminPage.DltSupplier, "");
		Thread.sleep(2000);
		aDriver.click(PharmacySuperadminPage.Logout, "");
		Thread.sleep(2000);
		aDriver.click(PharmacySuperadminPage.Signout, "");
		Thread.sleep(2000);
	}
        
        public void AddAdmin ()throws Exception {
	}*/
}
