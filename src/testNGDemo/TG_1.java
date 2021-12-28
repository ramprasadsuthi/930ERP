package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TG_1 {
	
  @BeforeTest 
  public void setUPTestData() {
	  System.out.println("This method will create pre-testdata for testcases..");
  }
  
  @AfterTest 
  public void cleaningUPTestData() {
	  System.out.println("This method will clean pre-testdata created..");
  }
	
  @BeforeMethod
  public void loginTC() {
	  System.out.println("This method will use for login..");
  }
  
  @AfterMethod
  public void logoutTC() {
	  System.out.println("This method will use for Logout..");
  }
  
  @Test
  public void TestCase_1() {
	  System.out.println("This is my first TestCase in TestNG..");
	  int a=10;
	  Assert.assertEquals(a, 20);
  }
  
  @Test
  public void TestCase_2() {
	  System.out.println("This is my second TestCase in TestNG..");
  }
}
