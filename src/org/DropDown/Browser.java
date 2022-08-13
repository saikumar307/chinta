package org.DropDown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser {
	public static void main(String[] args) throws  IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.tagName("select"));
		Select s = new Select(dropdown);
		
		boolean b = s.isMultiple();
		System.out.println(b);
		
	//	s.selectByValue("IND");
		s.selectByIndex(4);
		
		List<WebElement> list = s.getOptions();
		
		for (int i = 0; i <list.size(); i++) {
			
			WebElement each = list.get(i);
			String text = each.getText();
			System.out.println(text);
			
		}
		
}
}