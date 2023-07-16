package Shethspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fillpage {
	WebDriver driver;
	By entername= By.name("customer[first_name]");
	By enteremail=By.name("customer[email]");
	By enterlast=By.id("LastName");
	By enterpasswprd=By.id("CreatePassword");
	By click = By.xpath("//input[@type='submit']");
	


public fillpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
public void entername(String firstname) {
	driver.findElement(entername).sendKeys("name");
}
public void enteremail(String email) {
	driver.findElement(enteremail).sendKeys("email");
}
public void enterlast(String lastname) {
	driver.findElement(enterlast).sendKeys("lastname");
}
public void enterpass(String pass) {

	driver.findElement(enterpasswprd).sendKeys("password");
}
public void submit() {

	driver.findElement(click).click();
}

}
