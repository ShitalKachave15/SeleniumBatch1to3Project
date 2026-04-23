package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 
//		 driver.findElement(By.id("user-name")).sendKeys("dhsjd");
		 WebElement element= driver.findElement(By.id("user-name"));
		 element.sendKeys("standard_user");
		 Thread.sleep(2000);
		 
		 element.clear();
		 
	}

}
