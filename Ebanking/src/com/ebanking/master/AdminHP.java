package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP 
{
 //Element Properties
	
	@FindBy(xpath="//img[@src='images/Branches_but.jpg']")
	WebElement Branch;
	
	@FindBy(xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement Role;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	WebElement Employee;
	
	@FindBy(xpath=".//*[@id='Table_02']/tbody/tr/td[3]/a/img")
	WebElement Logout;
	
	
	//Element Methods
	
	public void br() 
	{
	Branch.click();
	}
	

	public void Rol() 
	{
	Role.click();
	}

}

