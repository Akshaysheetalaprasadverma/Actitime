package com.Actitimetestscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ActitimeObjectsRepository.Homepage;
import com.ActitimeObjectsRepository.Taskpage;
import com.actitimegenericlibrary.Testdata.Baseclass;
import com.actitimegenericlibrary.Testdata.FileLibrary;

public class CreateCostomer extends Baseclass {

	
	@Test
	public void createCustomer() throws EncryptedDocumentException,IOException {
		Homepage hp=new Homepage (driver);
		hp.getTasktab().click();
		Taskpage tp=new Taskpage (driver);
		tp.getAddnewbtn().click();
		tp.getNewcust().click();
		FileLibrary f=new FileLibrary();
		String name = f.readDataFromExcel("pavan", 1, 1);
		tp.getCustname().sendKeys(name);
		String desp = f.readDataFromExcel("pavan", 1, 2);
		tp.getCustdesp().sendKeys(desp);
		tp.getCreatecustbtn().click();
		
		
	}
}
