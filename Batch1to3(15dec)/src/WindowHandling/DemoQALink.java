package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQALink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.get("https://demoqa.com/links");
  driver.findElement(By.linkText("Home")).click();
  Thread.sleep(2000);
  
  Set<String> ids=driver.getWindowHandles();
	Iterator <String> it=ids.iterator(); 
String parentid=it.next();
String childid=it.next();

   driver.switchTo().window(childid);
  driver.findElement(By.xpath("//img[@class=\"banner-image\"]")).click();
  Thread.sleep(2000);  
  driver.switchTo().window(childid);
  Thread.sleep(2000); 
  driver.switchTo().window(parentid);
  Thread.sleep(2000); 
//  driver.close();
  driver.quit();
	}

}
