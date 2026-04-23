package Selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");        
       Thread.sleep(3000);

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.name("username")).sendKeys("Admin");
       driver.findElement(By.name("password")).sendKeys("admin123");
       driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();      
    
       Thread.sleep(3000);
       //pim link
     //  driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[2]")).click();
       driver.findElement(By.xpath("(//a[@class=\"oxd-main-menu-item\"])[2]")).click();
       
       Thread.sleep(3000);
       //add button
       driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
	
       
       Thread.sleep(3000);
	    //upload file
      // driver.findElement(By.className("employee-image")).sendKeys("D:\\sample.class");
	
      //dirname:\\foldername\\filename.extension
//       ex. D:\\test\\sample.docx
   File file=new File("C:\\Users\\pc\\Documents\\images\\ajax-loader.gif");
   
   	WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
//   	Thread.sleep(2000);
      fileInput.sendKeys(file.getAbsolutePath());
	}

}
