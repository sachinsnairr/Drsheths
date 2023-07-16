package Testsheths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Shethspage.fillpage;

public class filltest {
	WebDriver driver;
	
@BeforeTest
public void setup()
{
	driver= new ChromeDriver();
	
}
@Test
public void Tetsting()
{
	fillpage ob=new fillpage(driver);
	ob.entername("sachin");
	ob.enterlast("s");
	ob.enteremail("sachinsnair1998@gmail.com");
	ob.enterpass("password123");
	ob.submit();
	
}
}
