package com.phpTravels.qa.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpTravels.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	
	@FindBy(xpath="//a[@title='Hotels']//span[text()='Hotels   ']")
	WebElement hotelsLink;
	
	@FindBy(xpath="//a[@title='Travelstart']//span[text()='Flights  ']")
	WebElement flightsLink;
	
	@FindBy(xpath="//a[@title='Tours']//span[text()='Tours    ']")
	WebElement toursLink;
	
	@FindBy(xpath="//a[@title='Cars']//span[text()='Cars     ']")
	WebElement carsLink;
	
	@FindBy(xpath="//a[@title='Offers']//span[text()='Offers   ']")
	WebElement offersLink;
	
	@FindBy(xpath="//a[@title='Ivisa']//span[text()='c']")
	WebElement visaLink;
	
	@FindBy(xpath="//a[@title='Blog']//span[text()='Blog     ']")
	WebElement blogLink;
	
	@FindBy(xpath="//a[text()='info@levilova.com']")
	WebElement mailLink;
	
	@FindBy(xpath="//*[@id=\"li_myaccount\"]/a")
	WebElement myAccountLink;
	
	@FindBy(xpath="//li/a[text()=' Login']")
	WebElement myAccountLoginLink;
	
	@FindBy(xpath="//li/a[text()='  Sign Up']")
	WebElement myAccountSignUpLink;
	
	@FindBy(xpath="//*[@id=\"sidebar_left\"]/div/div/ul/li[2]/a/strong/text()")
	WebElement currencyLink;
	
	@FindBy(xpath="//*[@id=\"sidebar_left\"]/div/div/ul/ul/li/a/img")
	WebElement languageLink;
	
	@FindBy(xpath="//*[@id=\'body-section\']/div[1]/div/div/div[1]/div/ul/li[1]/a")
	WebElement quickHomePageHotelLink;
	
	@FindBy(xpath="//*[@id=\"select2-drop\"]/div/input")
	WebElement quickHomePageSearchtxtFd;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public HotelsPage hotelsLinkPage() {
		
		hotelsLink.click();
		
		return new HotelsPage();
		
	}
	
	public FlightsPage flightsLinkPage() {
		
		flightsLink.click();
		
		return new FlightsPage();
		
	}
	
	public ToursPage toursLinkPage() {
			
		toursLink.click();
			
			return new ToursPage();
			
	}
	
	
		

	public CarsPage carsLinkPage() {
		
		carsLink.click();
		
		return new CarsPage();
		
	}


	public OffersPage offersLinkPage() {
		
		offersLink.click();
		
		return new OffersPage();
		
	}



	public VisaPage visaLinkPage() {
		
		visaLink.click();
		
		return new VisaPage();
		
	}


	public BlogPage blogLinkPage() {
		
		blogLink.click();
		
		return new BlogPage();
		
	}


	public HomePage mailLinkPage() {
		
		mailLink.click();
		
		return new HomePage();
		
	}


	public MyAccountPage myAccountLinkPage() {
		
		myAccountLink.click();
		
		return new MyAccountPage();
		
	}


	public CurrencyPage currencyLinkPage() {
		
		currencyLink.click();
		
		return new CurrencyPage();
		
	}


	public HotelsPage languageLinkPage() {
		
		hotelsLink.click();
		
		return new HotelsPage();
		
	}
	
	public HotelsPage quickHomePageHotelLinkPage() throws InterruptedException {
			
		quickHomePageHotelLink.click();
		driver.findElement(By.xpath("//*[@id=\'body-section\']/div[1]/div/div/div[1]/div/ul/li[1]/a")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#dpd1 > input")).click();
		
		Thread.sleep(2000);
		String expectedMouth= "June 2018";
		
		
		
		String currentMonth=driver.findElement(By.cssSelector("body > div:nth-child(23) > div.datepicker-days > table > thead > tr:nth-child(1) > th.switch")).getText();
		
		if (expectedMouth.equals(currentMonth)) {
			System.out.println("The month entered is already selected");
		}
		//if expectedMouth entering is not already selected the do the following
		else {
			for(int j=1; j<12;j++) {
				//clicking on the next button
				driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[3]")).click();
				//Thread.sleep(2000);
				
				
				
				//returning the value of current month
				currentMonth=driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[2]")).getText();
			
				
				if (expectedMouth.equals(currentMonth)) {
					System.out.println("Expected month now selected  " + currentMonth);
					break; //because we do not want to loop to carry on with next link being clicked again
				}
			}
		}
		//Thread.sleep(2000);
		//getting the days of the month
		//td contains the days of the month
		//webElement for the parent
		WebElement datePicker=driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/tbody"));
		
		
		
		//pick up all tds - days inside trs of tbody
		List<WebElement> dates=datePicker.findElements(By.tagName("td"));
		
		//for each date in a collection of dates webElements
		for(WebElement date : dates) {
		
			String calenDates = date.getText();
			System.out.println(calenDates);
			
			
			if(calenDates.equals("5")) {
				date.click();
				break;
			
	
			}
		
		
	
	
		}
		
			
			return new HotelsPage();
			
	
	}

	
	
	
	
	
	
	
	
	
	

}
