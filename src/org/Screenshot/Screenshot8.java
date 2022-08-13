package org.Screenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshot8 {
	public static void main(String[] args) throws  IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("motorolo");
		
		WebElement enter = driver.findElement(By.xpath("(//input[@tabindex='0']) [2]"));
		enter.click();
	}
}
