package org.DropDown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) throws  IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("react-select-3-input"));
		Select s = new Select(dropdown);
		List<WebElement> allsel = s.getAllSelectedOptions();
		for (WebElement eachsel : allsel) {
			
			System.out.println(eachsel.getText());
		}
}
}