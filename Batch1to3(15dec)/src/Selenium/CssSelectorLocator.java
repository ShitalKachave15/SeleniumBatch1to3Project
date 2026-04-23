package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/text-box");
//		  1)tag and classname= (.)sign  input.form-control
		
		  driver.findElement(By.cssSelector("input.form-control")).sendKeys("abc");
		  
//		  2)tag and id  =>(#) sign input#userEmail
		  
		  driver.findElement(By.cssSelector("input#userEmail")).sendKeys("abc@gmail.com");
		  
//		  3)tag and attribute = []sign   textarea[placeholder="Current Address"]
		  
		  driver.findElement(By.cssSelector("textarea[placeholder=\"Current Address\"]")).sendKeys("thane");
	
//	    4)tag,classname,attribute       textarea.form-control[id="permanentAddress"]
		  driver.findElement(By.cssSelector("textarea.form-control[id=\"permanentAddress\"]")).sendKeys("thane");
	}

}
