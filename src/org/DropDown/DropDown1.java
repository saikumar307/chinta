package org.DropDown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
	public static void main(String[] args) throws  IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.tagName("select"));
		Select s = new Select(dropdown);
		
		boolean b = s.isMultiple();
		System.out.println(b);
		
		s.selectByVisibleText("Orange");
		s.selectByIndex(0);
		s.selectByValue("grape");
		
		
		System.out.println("\nprint the options which I selected\n");
		List<WebElement> allsel = s.getAllSelectedOptions();
		for (WebElement eachsel : allsel) {
			System.out.println(eachsel.getText());
			
			System.out.println("\nprint the 1st options which selected ");
			
			WebElement firstsel = s.getFirstSelectedOption();
		System.out.println(firstsel.getText());
			
		}
	
	}
}