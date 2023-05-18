package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver  driver;
@BeforeTest
public void openBrowser()
{
	Reporter.log("OPEN BROWSER",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
}
@BeforeMethod
public void login() throws IOException
{
	Reporter.log("LOGIN",true);
	FileLib f=new FileLib();
	String url = f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pwd = f.getPropertyData("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pwd);	
}
@AfterMethod
public void logOut()
{
	Reporter.log("LOGOUT",true);
	driver.findElement(By.xpath("//a[.='Logout']")).click();
}
@AfterClass
public void closeBrowser()
{
	Reporter.log("CLOSE BROWSER",true);
}
}
