package org.WebTable;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3 {
	public static void main(String[] args) throws  IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> allrows = driver.findElements(By.tagName("table"));
		int i = allrows.size();
		System.out.println(i);
}
}