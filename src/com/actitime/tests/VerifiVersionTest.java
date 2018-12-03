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
import com.actitime.pages.LoginPage;

public class VerifiVersionTest extends BaseTest 
{
 @Test
 public void verifyVersionTest() throws EncryptedDocumentException, InvalidFormatException, IOException
 {
	 String LoginTitle=ExcelData.getData("./Data/input.xlsx","Sheet2",0,2);
	 
	 LoginPage lp=new LoginPage(driver);
	 
	 //verify loginpage
	 lp.verifyPage(LoginTitle);
	 
	 //verify version
	 lp.verifyVersion();
 }
}
