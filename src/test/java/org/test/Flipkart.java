package org.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Flipkart {
@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\JUnit\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();
		WebElement Id = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		Id.sendKeys("sivag918@gmail.com");
		Assert.assertEquals(Id.getAttribute("value"), "sivag918@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
        pass.sendKeys("sivaflipkart");
        Assert.assertEquals(pass.getAttribute("value"), "sivaflipkart");
        WebElement Btn = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
        Btn.click();
        Thread.sleep(3000);
        WebElement MobNo = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
        MobNo.sendKeys("9750364952");
        Assert.assertEquals(MobNo.getAttribute("value"),"9750364952");
        WebElement CBtn = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
        CBtn.click();
        Thread.sleep(3000);
        WebElement Otp = driver.findElement(By.xpath("(//input[@class='_2zrpKA _1dBPDZ'])[1]"));
        Otp.sendKeys("124963");
        Assert.assertEquals(Otp.getAttribute("value"),"124963");
        Thread.sleep(3000);
        WebElement SPass = driver.findElement(By.xpath("(//input[@class='_2zrpKA _1dBPDZ'])[2]"));
        SPass.sendKeys("sivaflipkart");
        Assert.assertEquals(SPass.getAttribute("value"),"sivaflipkart");
        WebElement SBtn = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
        SBtn.click();
}
}

