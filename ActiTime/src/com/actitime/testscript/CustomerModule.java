package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
{
	Reporter.log("Create Customer",true);
	FileLib f=new FileLib();
	String createcustomer = f.getExcelData("CreateCustomer", 1, 2);
	String proj = f.getExcelData("CreateCustomer", 1, 3);
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAnbtn().click();
	t.getNcbtn().click();
	t.getCntbx().sendKeys(createcustomer);
	t.getDestbx().sendKeys(proj);
	t.getDdbtn().click();
	t.getSclbx().click();
	t.getCcbtn().click();
	Thread.sleep(5000);
	String expres = t.getActualres().getText();
	Assert.assertEquals(expres, createcustomer);
	
}
}
