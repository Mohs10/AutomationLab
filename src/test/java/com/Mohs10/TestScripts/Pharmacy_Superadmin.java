package com.Mohs10.TestScripts;

import java.util.Properties;

import org.testng.annotations.Test;

import com.Mohs10.Base.ScreenRecorderUtil;
import com.Mohs10.Base.StartBrowser;
import com.Mohs10.Base.XLUtils;
import com.Mohs10.Functions.CommonFuns;
import com.Mohs10.utility.Log;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class Pharmacy_Superadmin extends StartBrowser
{
	
	String excelfile = "C:\\Users\\DELL\\eclipse-workspace\\Jyotsna - Pharmacy\\ExcelTestInputData\\Mamatva.xlsx";
	String xlsheet = "Superadmin";
	
	@Test()
	
	public void PharmacyLoginTestcase() throws Exception {
		CommonFuns hm = new CommonFuns();
		//CommonFuns hm1 = new CommonFuns();
		//CommonFuns hm2 = new CommonFuns();
		
		
		String Memailid = XLUtils.getStringCellData(excelfile, xlsheet, 2, 0);//(rows, columns) 
		String Mpwd = XLUtils.getStringCellData(excelfile, xlsheet, 2, 1);
		String Location = XLUtils.getStringCellData(excelfile, xlsheet, 2, 2);
		
		//String Location = XLUtils.getStringCellData(excelfile, xlsheet, 2, 2);
		
		
		
		/*String AdminName = XLUtils.getStringCellData(excelfile, xlsheet, 1, 2);
		String Location = XLUtils.getStringCellData(excelfile, xlsheet, 1, 3);
		String emailid = XLUtils.getStringCellData(excelfile, xlsheet, 1, 4);
		String password = XLUtils.getStringCellData(excelfile, xlsheet, 1, 5);*/
		
		//String emailid1 = XLUtils.getStringCellData(excelfile, xlsheet, 2, 0);//(rows, columns) 
		//String pwd1 = XLUtils.getStringCellData(excelfile, xlsheet, 2, 1);
		
		
		/*String SName = XLUtils.getStringCellData(excelfile, xlsheet, 1, 2);
		String CntctNum = XLUtils.getStringCellData(excelfile, xlsheet, 1, 3);
		String Email = XLUtils.getStringCellData(excelfile, xlsheet, 1, 4);
		String GSTNum = XLUtils.getStringCellData(excelfile, xlsheet, 1, 5);*/
		
		hm.MamatvaLogin(Memailid, Mpwd,Location );  //,
		//hm1.Login(emailid1, pwd1); 
		Thread.sleep(5000);
		
		
		/*hm2.AddSupplier(SName, CntctNum, Email, GSTNum);		
		Thread.sleep(5000);*/
		

	}

}
