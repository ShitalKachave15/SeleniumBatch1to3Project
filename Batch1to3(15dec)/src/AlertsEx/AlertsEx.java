package AlertsEx;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEx {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.get("https://demoqa.com/alerts");
  
//  Alert alert=driver.switchTo().alert();
  
  driver.findElement(By.id("alertButton")).click();
  Thread.sleep(2000);
  driver.switchTo().alert().accept();
  Thread.sleep(2000);
  
  driver.findElement(By.id("confirmButton")).click();
  Thread.sleep(2000);
 String text= driver.switchTo().alert().getText();
 System.out.println(text);  
 Thread.sleep(2000);
  driver.switchTo().alert().dismiss();
  
  
  driver.findElement(By.id("promtButton")).click();
  Thread.sleep(2000);
  driver.switchTo().alert().sendKeys("test data");
  
  Thread.sleep(2000);
  driver.switchTo().alert().accept();
  
  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  
  FileUtils.copyFile(scrFile, new File("D:\\Work\\Screenshot.png"));


  
  
	}

}
