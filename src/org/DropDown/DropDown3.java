package org.DropDown;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown3 {
	public static void main(String[] args) throws  IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		login.click();
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("9874563214");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("98745875");
		WebElement repass = driver.findElement(By.xpath("//input[@name='re_password']"));
		repass.sendKeys("9874654754");
		WebElement name = driver.findElement(By.xpath("//input[@name='full_name']"));
		name.sendKeys("saikumar");
		WebElement email = driver.findElement(By.xpath("//input[@name='email_add']"));
		email.sendKeys("sai@gmail.com");
		WebElement cap = driver.findElement(By.id("captcha"));
		System.out.println(cap.getAttribute("value"));
		
		
		
		
	
	}
}
