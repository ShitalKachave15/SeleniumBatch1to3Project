package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommondEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
//driver.get("https://www.facebook.com/");

   driver.navigate().to("https://www.facebook.com/");
   driver.findElement(By.linkText("Forgotten password?")).click();
   Thread.sleep(2000);
   driver.navigate().back();
   Thread.sleep(2000);
   driver.navigate().forward();
   
   Thread.sleep(2000);
   driver.navigate().refresh();
	}

}
