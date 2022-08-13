package org.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws  IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chsai\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		WebElement scrolldown = driver.findElement(By.xpath("(//font[@size='-1']) [17]"));
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		
		File dess = new File("C:\\Users\\chsai\\eclipse-workspace\\chromeBrowser\\Screenshots\\greens3.png");
		FileUtils.copyFile(src, dess);
	}
}
