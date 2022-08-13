package org.WindowsHandling;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) throws  IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		
		WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
		btn.click();
		
		WebElement button = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		button.click();
		WebElement print = driver.findElement(By.xpath("(//span[@aria-hidden='true']) [17]"));
		
	}
}