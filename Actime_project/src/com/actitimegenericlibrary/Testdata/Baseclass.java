package com.actitimegenericlibrary.Testdata;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public WebDriver driver;
	@BeforeSuite
	public void databaseConnect () {
		Reporter.log("database connected",true);
}

@BeforeClass
public void LaunchBrowser () {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com");
	Reporter.log("Browser is launched successfully",true);
}

@BeforeMethod
public void Login() throws IOException {
	driver.findElement(By.id ("username")).sendKeys("admin");
	driver.findElement(By.name ("pwd")).sendKeys ("manager");
	driver.findElement(By.xpath ("//div[.='Login ']")).click();
	Reporter.log("logged in successfully",true);
}	
 
@AfterMethod
public void logout() {
	driver.findElement(By.id("logoutLink")).click();
	Reporter.log("logged out successfully",true);
	
}
@AfterClass
public void closeTheBrowser() {
	driver.close();
	Reporter.log("Browser closed successfully",true);
	
}
@AfterSuite
public void dissconnectdatabase() {
	Reporter.log("database disconnected successfully",true);
}

public void onTestFaileButwithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

}




