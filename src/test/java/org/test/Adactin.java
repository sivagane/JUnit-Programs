package org.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
@Test
public void test() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\JUnit\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.adactin.com/HotelApp/");
	driver.manage().window().maximize();
	String st = driver.getCurrentUrl();
	System.out.println(st);
}
}
