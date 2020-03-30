package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreensTech1 {
WebDriver d;

By Cert=By.xpath("//a[text()='Certifications']");
By Scroll=By.xpath("//h1[text()='PEGA']");
By Cour=By.xpath("(//a[@href='selenium-course-content.html'])[2]");
By Scroll1=By.xpath("(//h2[@class='red_text'])[6]");
By Text=By.xpath("//p[contains(text(),'HI, I have taken Selenium training in chennai at Greens technology.')]");

public GreensTech1(WebDriver d) {
	this.d=d;
}

public void printparagraphgreens() {
	d.findElement(Cert).click();
	JavascriptExecutor js=(JavascriptExecutor)d;
	WebElement ScrollCourCont = d.findElement(Scroll);
	js.executeScript("arguments[0].scrollIntoView(true)", ScrollCourCont);
	d.findElement(Cour).click();
	WebElement ScrollParagraph = d.findElement(Scroll1);
	js.executeScript("arguments[0].scrollIntoView(true)", ScrollParagraph);
	WebElement Te = d.findElement(Text);
	String Para = Te.getText();
	System.out.println(Para);
}
}

