package Shethspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addtocartpage {
	WebDriver driver;
	
By clickproduct=By.xpath("//button[@type='submit']");


public addtocartpage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}


public void click() {
	driver.findElement(clickproduct).click();
	
}
}
