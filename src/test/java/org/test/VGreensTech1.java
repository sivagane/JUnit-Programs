package org.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VGreensTech1 {
	@Test
public void verifrgreenstech1() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\JUnit\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://www.greenstechnologys.com/");
	
	GreensTech1 gr1=new GreensTech1(d);
	
	gr1.printparagraphgreens();
}
}
