package Shethspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createaccpage {
WebDriver driver;
By clickcreateacc=By.xpath("//button[@type='button']");

public Createaccpage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}

public void click() {
	driver.findElement(clickcreateacc).click();
}
}

