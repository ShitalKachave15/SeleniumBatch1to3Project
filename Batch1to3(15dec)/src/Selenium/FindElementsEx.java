package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.get("https://demo.automationtesting.in/Register.html");
  
  
  List<WebElement> element=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
  
  for(int i=0;i<element.size();i++)
  {
	  element.get(i).click();
  }
  
	}

}
