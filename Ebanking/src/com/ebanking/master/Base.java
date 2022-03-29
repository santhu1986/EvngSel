package com.ebanking.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
  
	Library Lb=new Library();
	
  @BeforeTest
  public void beforeTest()
  {
  Lb.AdminLgn("Admin","Te$ting@");
  }

  @AfterTest
  public void afterTest() 
  {
  Lb.admlgt();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
  Lb.OpenApp("http://122.175.8.158/ranford2");
  }

  @AfterSuite
  public void afterSuite() 
  {
  Lb.Appc();
  }

}
