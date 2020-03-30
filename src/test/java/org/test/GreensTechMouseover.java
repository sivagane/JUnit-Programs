package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GreensTechMouseover {
WebDriver d;

By Courses=By.xpath("//a[text()='COURSES']");
By JavaTraining=By.xpath("(//a[@href='http://www.greenstechnologys.com/java-training-course-content.html'])[1]");
By JavaCoreTraining=By.xpath("//span[text()='Core Java Training']");
By Scroll=By.xpath("//p[text()='Do not wait anymore! Call Us @ ']");
By ReviewByAnitha=By.xpath("//h2[text()='Java training Reviews from Anitha']");

public GreensTechMouseover(WebDriver d) {
	this.d=d;
}

public void MouseActions() throws InterruptedException {
	Actions a=new Actions(d);
	WebElement CoursesMove = d.findElement(Courses);
	a.moveToElement(CoursesMove).perform();
	Thread.sleep(3000);
    WebElement JavaTrainingMove = d.findElement(JavaTraining);
	a.moveToElement(JavaTrainingMove).perform();
	Thread.sleep(3000);
	WebElement JavaCoreMove = d.findElement(JavaCoreTraining);
    JavaCoreMove.click();
    Thread.sleep(3000);
    JavascriptExecutor js=(JavascriptExecutor)d;
    WebElement ScrollDown = d.findElement(Scroll);
    js.executeScript("arguments[0].scrollIntoView(true)",ScrollDown );
    Thread.sleep(3000);
    WebElement Text = d.findElement(ReviewByAnitha);
    String ReviewLine = Text.getText();
    System.out.println(ReviewLine);
    
}

}
