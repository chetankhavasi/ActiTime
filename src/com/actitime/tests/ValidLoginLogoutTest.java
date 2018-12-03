package com.actitime.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
 @Test
 public void testValidLoginLogout() throws EncryptedDocumentException, InvalidFormatException, IOException
 {
	 String user=ExcelData.getData("./Data/input.xlsx","Sheet2",0,0);
	 String pass=ExcelData.getData("./Data/input.xlsx","Sheet2",0,1);
	 String LoginTitle=ExcelData.getData("./Data/input.xlsx","Sheet2",0,2);
	 String enterTimeTrack=ExcelData.getData("./Data/input.xlsx","Sheet2",0,3);
	 
	 LoginPage lp=new LoginPage(driver);
	 EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
	 
	 //verify loginpage
	 lp.verifyPage(LoginTitle);
	 
	 //enter username
	 lp.enterUserName(user);
	 
	 //enter password
	 lp.enterPassword(pass);
	 
	 //click on login
	 lp.clickOnLogin();
	 
	 //verify enter time track
	 ep.verifyTitle(enterTimeTrack);
	 
	 //click on logout
	 ep.clickOnLogout();
	 
	 //verify loginpage
	 lp.verifyPage(LoginTitle);
	 
 }
}
