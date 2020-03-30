package org.test;

import org.junit.After;
import org.junit.AfterClass;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class Facebook {

WebDriver d;

By User=By.id("email");
By Pass=By.id("pass");
By LogBtn=By.id("loginbutton");

public Facebook(WebDriver d) {
	this.d=d;
}

public void loginfacebook(String s1,String s2) {
	d.findElement(User).sendKeys(s1);
	d.findElement(Pass).sendKeys(s2);
	d.findElement(LogBtn).click();
}
}
