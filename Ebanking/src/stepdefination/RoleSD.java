package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleSD 
{

WebDriver driver;

@Given("^Tester Shouls on RHP$")
public void tester_Shouls_on_RHP() throws Throwable 
{
	driver=new FirefoxDriver();
	
	//Maximise
	
	driver.manage().window().maximize();
	
	//Url
	
	driver.get("http://122.175.8.158/ranford2");
	
}

@When("^Tester Enters Uname and Passwod and click Login$")
public void tester_Enters_Uname_and_Passwod_and_click_Login() throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Mq$ystems@");
	driver.findElement(By.xpath("//input[contains(@name,'login')]")).click();

}

@When("^Tester Clicks on Role$")
public void tester_Clicks_on_Role() throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	
}

@Then("^Tester Click on New Role and Enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void tester_Click_on_New_Role_and_Enter_and(String rname, String rtype) throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(rname);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(rtype);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	Thread.sleep(4000);
	String Actval=driver.switchTo().alert().getText();
	
	System.out.println(Actval);
	
	
      driver.switchTo().alert().accept();
      driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();  
    
}

@When("^Tester Close The Application$")
public void tester_Close_The_Application() throws Throwable
{
    driver.close(); 
}


}
