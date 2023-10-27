package org.test;
// run the test caste with multiple times
//invocation timeout

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation {
	ChromeDriver driver = new ChromeDriver();
	
	@Test(invocationCount = 2, threadPoolSize = 2)
	
public void login(){
	 driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("testuser2028@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.close();
}

}
