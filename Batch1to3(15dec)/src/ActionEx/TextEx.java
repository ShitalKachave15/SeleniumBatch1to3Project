package ActionEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.get("https://demoqa.com/text-box");
  
  Actions action=new Actions(driver);
  WebElement text=driver.findElement(By.id("userName"));
//  text.sendKeys("jdzfv");
//  action.keyDown(text, Keys.SHIFT);
//  action.sendKeys("gfdg");
//  action.keyUp(Keys.SHIFT);
//  action.build();
//  action.perform();
  
  action.keyDown(text, Keys.SHIFT).sendKeys("hjdsfjds").keyUp(Keys.SHIFT).build().perform();
	}

}
