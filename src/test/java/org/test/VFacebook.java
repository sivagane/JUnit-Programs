package org.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VFacebook {
@Test
public void verifylogin() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\JUnit\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https:\\www.facebook.com");
	
	Facebook fa=new Facebook(d);
	
	fa.loginfacebook("sivag918@gmail.com","08091990");
}

}
