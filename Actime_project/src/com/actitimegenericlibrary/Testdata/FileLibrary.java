package com.actitimegenericlibrary.Testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {

	public String readDataFrompropertyFile(String key) throws IOException {
		FileInputStream fis =new FileInputStream("./Testdata/commandate.property");
		Properties p=new Properties();
		p.load(fis);
		 String value = p.getProperty(key);
		 return value;
	}
	
	public String readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream ("./Testdata/automationdata.xlsx");
    	Workbook wb = WorkbookFactory.create(fis);
    	String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
    	return value ;
	}
}