package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath = "//div[.='Add New']")
private WebElement anbtn;
@FindBy(xpath = "//div[.='+ New Customer']")
private WebElement ncbtn;
@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
private WebElement cntbx;
@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement destbx;
@FindBy(xpath = "//div[@class='emptySelection']")
private WebElement ddbtn;
@FindBy(xpath = "//div[@class='searchItemList']/div[2]")
private WebElement sclbx;
@FindBy(xpath = "//div[.='Create Customer']")
private WebElement ccbtn;
@FindBy(id="logoutLink")
private WebElement logout;
@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[1]")
private WebElement actualres;
public TaskListPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getAnbtn() {
	return anbtn;
}
public WebElement getNcbtn() {
	return ncbtn;
}
public WebElement getCntbx() {
	return cntbx;
}
public WebElement getDestbx() {
	return destbx;
}
public WebElement getDdbtn() {
	return ddbtn;
}
public WebElement getSclbx() {
	return sclbx;
}
public WebElement getCcbtn() {
	return ccbtn;
}
public WebElement getLogout() {
	return logout;
}
public WebElement getActualres() {
	return actualres;
}


}
