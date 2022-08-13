package org.DropDown;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown4 {
	public static void main(String[] args) throws  IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\chromeBrowser\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.name("country"));
		Select s = new Select(name);
		List<WebElement> all = s.getOptions();
		for (WebElement each : all) {
			
			System.out.println(each.getText());
		}
		
		List<WebElement> list = s.getOptions();
		for (WebElement total : list) {
			
			System.out.println(total.getAttribute("name"));
		}
}
}