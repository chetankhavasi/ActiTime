package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
public static String getData(String filepath,String sheetname,int rn,int cn) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	try 
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Cell c=wb.getSheet(sheetname).getRow(rn).getCell(cn);
		String data=c.getStringCellValue();
		return data;
	} 
	catch (Exception e) 
	{
		
		return " ";
	}

}
}
