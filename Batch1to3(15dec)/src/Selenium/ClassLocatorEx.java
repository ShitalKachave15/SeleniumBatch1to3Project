package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.get("https://demoqa.com/text-box");
  
    driver.findElement(By.className("form-control")).sendKeys("gfhj");
    driver.findElement(By.className("form-control")).sendKeys("3534");
	}

}
