package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

import junit.framework.Assert;

public class JunitFacebook {
	public static WebDriver d;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\JUnit\\div\\chromedriver.exe");
		 d= new ChromeDriver();
	}
	@Before
	public void starttime() {
		Date d = new Date();
		System.out.println(d);
	}
    @Test
    public void test() {
	
	d.get("https://www.facebook.com/");
	d.manage().window().maximize();
	WebElement EmailId = d.findElement(By.id("email"));
	EmailId.sendKeys("sivag918@gmail.com");
	WebElement Pass = d.findElement(By.id("pass"));
	Pass.sendKeys("123456");
	WebElement LoginBtn = d.findElement(By.id("loginbutton"));
	LoginBtn.click();
	Assert.assertTrue(d.getTitle().contains("Facebook"));
	}
    @After
    public void endtime() {
    	Date d=new Date();
    	System.out.println(d);
    }
    @AfterClass
    public static void kill() {
    	d.quit();
    }
}
