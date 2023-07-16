package Shethspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hompage {
	WebDriver driver;
	By clickaccount= By.xpath("//a[@href='/account']");
	
public Hompage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}

public void click() {

	driver.findElement(clickaccount).click();
}

}
