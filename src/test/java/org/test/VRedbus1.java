package org.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VRedbus1 {
	@Test
public void VerifyRedbus() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\JUnit\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.redbus.in/");
	d.manage().window().maximize();
	
	Redbus1 R1=new Redbus1(d);
	
	R1.Signinredbus( "9750364952", "774327");
}
}
