package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sneakers {
	@Test
	
	public void shoe(){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("testuser2028@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")).click();
		driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[text()='Blue and green Sneaker']")).click();
		WebElement qty= driver.findElement(By.xpath("//input[@class=\"qty-input\"]"));
		qty.clear();
		qty.sendKeys("10");
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-28\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.close();
		
		
		
	}

}
