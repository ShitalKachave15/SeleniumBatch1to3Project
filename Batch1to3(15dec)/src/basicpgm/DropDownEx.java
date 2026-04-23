package basicpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.get("https://demoqa.com/select-menu");
 
 Select color=new Select(driver.findElement(By.id("oldSelectMenu")));
    color.selectByVisibleText("Green");
    Thread.sleep(2000);
    color.selectByValue("6");
    Thread.sleep(2000);
    color.selectByIndex(0);
    
    
   Select cars=new Select(driver.findElement(By.id("cars")));
   
   cars.selectByVisibleText("Opel");
   cars.selectByIndex(0);
   Thread.sleep(2000);
   cars.deselectByValue("opel");
   cars.deselectByVisibleText("Volvo");
 
	} 

}
