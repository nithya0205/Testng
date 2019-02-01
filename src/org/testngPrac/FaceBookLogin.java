package org.testngPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class FaceBookLogin {
	static WebDriver Driver;

	@BeforeClass
	private static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ns43\\Nithya-workspace\\Selenium\\Driver\\chromedriver.exe");
		// Launch browser
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
	}

	@AfterClass
	private void quitBrowser() {
		Driver.quit();
	}

	@Parameters({"UserName", "Password"})
	@Test(priority = 1)
	private void login(String UserName1, String Password1) {

		System.out.println(UserName1);
		System.out.println(Password1);
		Driver.findElement(By.id("email")).sendKeys(UserName1);
		Driver.findElement(By.id("pass")).sendKeys(Password1);
		Driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	@Test(priority =5)
	private void DummyTest() {
		
System.out.println("DummyTest");
	}

}
