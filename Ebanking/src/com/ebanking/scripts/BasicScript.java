package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicScript {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String Expval="Ranford Bank";
		
		//Launch Firefox
		
		WebDriver driver=new FirefoxDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//Url
		
		driver.get("http://122.175.8.158/ranford2");
		
		String Actval=driver.findElement(By.xpath("//span[@class='style10'][contains(.,'Ranford Bank')]")).getText();
		
		//Condition
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
			System.out.println("Application Launch Succ");
		}
		else
		{
			System.out.println("Application Failed to Launch");
		}
		//get Title
		
	//	String Tit=driver.getTitle();
		//System.out.println(Tit);
		
		//Admin Login
		
		Expval="Welcome to Admin";
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Te$ting@");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).click();
	
        Actval=driver.findElement(By.xpath("//font[contains(@size,'3')]")).getText();
		System.out.println(Actval);
		//Condition
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
			System.out.println("Admin Login Succ");
		}
		else
		{
			System.out.println("Admin Login failed");
		}

		//Branch Creation
		
		Expval="Sucessfully";
		
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'BtnNewBR')]")).click();
		
        driver.findElement(By.id("txtbName")).sendKeys("Mindqsystestgg");
		
		driver.findElement(By.id("txtAdd1")).sendKeys("Srnagar");
		
		driver.findElement(By.id("txtZip")).sendKeys("45678");
		
		
		//DropDown
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText("INDIA");
		
		new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText("GOA");
		
         new Select(driver.findElement(By.id("lst_cityI"))).selectByVisibleText("GOA");
		
		driver.findElement(By.xpath("//input[@name='btn_insert']")).click();
		
		Thread.sleep(3000);
		
		Actval=driver.switchTo().alert().getText();
		
		Thread.sleep(3000);
		
		if (Actval.contains(Expval)) 
		{
			System.out.println("Branch Creation");
		}
		else
		{
			System.out.println("Branch Already Exist");
		}
		//Alert
		
		driver.switchTo().alert().accept();
		
		//Role Creation
		
		//Employee Creation
		
		//Banker Login

	}

}
