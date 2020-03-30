package org.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VGreenTechMouseover {
@Test
public void verifrgreenstechmouseover() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\JUnit\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://www.greenstechnologys.com/");
	
	GreensTechMouseover gmo=new GreensTechMouseover(d);
	
	gmo.MouseActions();
}
}
