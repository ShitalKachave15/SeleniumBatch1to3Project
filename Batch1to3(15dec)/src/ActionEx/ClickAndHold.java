package ActionEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
	        
			
			driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
WebElement elementA=driver.findElement(By.xpath("//li[@name=\"B\"]"));
		
		WebElement elementB=driver.findElement(By.xpath("//li[@name=\"A\"]"));
		
		Actions actions=new Actions(driver);
		
	Action action=	actions.clickAndHold(elementB)
        .moveToElement(elementA)
        .release(elementB)
        .build();
		
		action.perform();
	}

}
