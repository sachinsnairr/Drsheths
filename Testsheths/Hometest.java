package Testsheths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Shethspage.Hompage;

public class Hometest {
	
	WebDriver driver;
	
@BeforeTest
public void Setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.drsheths.com");
}
@Test
public void Testing()
{
	Hompage ob= new Hompage(driver);
	ob.click();
}
}
