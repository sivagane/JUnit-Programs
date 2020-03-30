package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreensTech {

	WebDriver d;
	
	By LaLine=By.xpath("//h2[text()='Greens Technologys Overall Reviews']");
	By FtLine=By.xpath("//h1[text()='No 1 Software Training Institutes in Chennai with Placements']");
	
	public GreensTech(WebDriver d) {
		this.d=d;
	}
	public void greensscroll() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)d;
		WebElement E = d.findElement(LaLine);
		 js.executeScript("arguments[0].scrollIntoView(true)",E);
		Thread.sleep(3000);
		 WebElement E1 = d.findElement(FtLine);
		js.executeScript("arguments[0].scrollIntoView(false)",E1);
	}
	
}
