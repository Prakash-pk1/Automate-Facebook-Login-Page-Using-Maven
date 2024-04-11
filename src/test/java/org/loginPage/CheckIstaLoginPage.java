package org.loginPage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIstaLoginPage {
	static WebDriver driver;
	
	
	@BeforeClass
	public static void browserLaunch() {
		driver=new ChromeDriver();
	}
	@Before
	public void url() {
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void testCase() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("username");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1233");
		
	}
	@After
	public void clickClose() {
		WebElement button = driver.findElement(By.id("loginbutton"));
		button.click();
		
		String text = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		System.out.println(text);
				
	}
	@AfterClass
	public static void message() throws InterruptedException {
		System.out.println("page checked");
		Thread.sleep(3000);
		driver.close();
	}	
}