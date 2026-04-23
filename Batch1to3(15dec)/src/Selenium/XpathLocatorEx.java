package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.get("https://demo.automationtesting.in/Register.html");
   
            driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("abc");

	  driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("yfejhd");
	  driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
	} 

}
