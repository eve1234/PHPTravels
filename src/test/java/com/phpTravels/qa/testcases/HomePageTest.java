package com.phpTravels.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phpTravels.qa.base.TestBase;
import com.phpTravels.qa.pages.HomePage;
import com.phpTravels.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		testUtil = new TestUtil();
		
	}
	
	@Test(priority=1)
	public void quickHomePageHotelLinkPageTest() throws InterruptedException {
		homePage.quickHomePageHotelLinkPage();
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
