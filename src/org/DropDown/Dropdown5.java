package org.DropDown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown5 {
	public static void main(String[] args) throws  IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("  https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement enter = driver.findElement(By.xpath("(//a[@role='button']) [2]"));
		enter.click();
	Thread.sleep(5000);
	WebElement d = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg']) [2]"));
	Select s = new Select(d);
	List<WebElement> allsel = s.getOptions();
	for (WebElement eachsel : allsel) {
		
		System.out.println(eachsel.getText());
	}
	Thread.sleep(5000);
	WebElement b = driver.findElement(By.xpath("//select[@title='Year']"));
	Select s1 = new Select(b);
	List<WebElement> selall = s1.getOptions();
	for (WebElement seleach : selall) {
		System.out.println(seleach.getText());
	}
}
}