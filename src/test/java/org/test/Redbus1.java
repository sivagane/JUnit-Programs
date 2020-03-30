package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Redbus1 {
WebDriver d;
	By Sigin=By.id("signin-block");
	By HideSignin=By.id("hc");
    By PhoneNo=By.id("mobileNoInp");
	By GenerateOtp=By.xpath("//div[@class='otpContainer clearfix border-r-3']");
	By EnterOtp=By.id("otp");
	By Verifyuser=By.id("verifyUser");
	
	public Redbus1(WebDriver d) {
		this.d=d;
	}
	
	public void Signinredbus(String s1,String s2) throws InterruptedException {
		d.findElement(Sigin).click();
		d.findElement(HideSignin).click();
		Thread.sleep(3000);
		WebElement Frame = d.findElement(By.xpath("//iframe[@class='modalIframe']"));
		d.switchTo().frame(Frame);
		Thread.sleep(3000);
		d.findElement(PhoneNo).sendKeys(s1);
		d.findElement(GenerateOtp).click();
		Thread.sleep(3000);
		d.findElement(EnterOtp).sendKeys(s2);
		d.findElement(Verifyuser).click();
		
	}
}


