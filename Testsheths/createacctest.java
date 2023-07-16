package Testsheths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Shethspage.Createaccpage;

public class createacctest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
		
	}
@Test
public void testing()
{
	Createaccpage ob=new Createaccpage(driver);
	ob.click();
}
}
