package Testsheths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Shethspage.addtocartpage;

public class addtocarttest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver= new ChromeDriver();
		
	}
	@Test
	public void Testing()
	{
		addtocartpage ob=new addtocartpage(driver);
		ob.click();
	}

}
