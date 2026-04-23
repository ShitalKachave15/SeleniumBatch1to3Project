package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.id("btn1")).click();
//		Thread.sleep(6000);
		driver.findElement(By.id("txt1")).sendKeys("text1");
		
	       driver.findElement(By.id("btn2")).click();
	       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(11));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
	       driver.findElement(By.id("txt2")).sendKeys("text2");
			
	}

}
