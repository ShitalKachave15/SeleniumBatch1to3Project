package ActionEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DblclickndRightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/buttons");
		  
		  Actions action=new Actions(driver);
		  WebElement dblbtn=driver.findElement(By.id("doubleClickBtn"));
		  action.doubleClick(dblbtn).perform();
		  
		  WebElement rightbtn=driver.findElement(By.id("rightClickBtn"));
		  action.contextClick(rightbtn).perform();
		  
	}

}
