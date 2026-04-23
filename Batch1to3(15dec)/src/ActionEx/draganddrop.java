package ActionEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/droppable");
		  
		  Actions action=new Actions(driver);
		  WebElement source=driver.findElement(By.id("draggable"));
		  WebElement destination=driver.findElement(By.id("droppable"));
		  
		  action.dragAndDrop(source, destination).perform();
	}

}
