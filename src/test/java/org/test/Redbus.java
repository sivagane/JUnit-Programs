package org.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Redbus {
@Test
public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\JUnit\\div\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.get("https://www.redbus.in/");
    driver.manage().window().maximize();
	Assert.assertTrue(driver.getCurrentUrl().contains("redbus"));
    driver.findElement(By.id("signin-block")).click();
    driver.findElement(By.id("hc")).click();
    Thread.sleep(3000);
    WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
    driver.switchTo().frame(frame);
    WebElement mobno = driver.findElement(By.id("mobileNoInp"));
    mobno.sendKeys("9750364952");
    Assert.assertEquals(mobno.getAttribute("value"),"9750364952");
    WebElement GenOtp = driver.findElement(By.xpath("//div[@class='otpContainer clearfix border-r-3']"));
    GenOtp.click();
    Thread.sleep(3000);
    WebElement Otp = driver.findElement(By.id("otp"));
    Otp.sendKeys("208188");
    Assert.assertEquals(Otp.getAttribute("value"),"208188");
    WebElement OtpBtn = driver.findElement(By.id("verifyUser"));
    OtpBtn.click();
}
}
