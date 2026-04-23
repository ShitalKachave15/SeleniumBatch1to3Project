package ActionEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollbarEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		  driver.get("https://sellglobal.ebay.in/seller-center/");
		  
//		  Actions action=new Actions(driver);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  
//		  action.keyDown(Keys.PAGE_DOWN).perform();
//		  Thread.sleep(3000);
//		  action.keyDown(Keys.PAGE_DOWN).perform();
//		  Thread.sleep(3000);
//		  action.keyDown(Keys.PAGE_UP).perform();
//		  Thread.sleep(3000);
//		  action.keyDown(Keys.PAGE_UP).perform();
//		  Thread.sleep(3000);
//		  action.keyDown(Keys.END).perform();
//		  Thread.sleep(3000);
//		  action.keyDown(Keys.HOME).perform();
		  
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)");
		  //scroll vertically down by pixcel 
		  Thread.sleep(5000);
		  
		  //scroll up
		  js.executeScript("window.scrollBy(0,-1000)"); 
		  Thread.sleep(4000);
		  
WebElement element=driver.findElement(By.xpath("(//h2[@class=\"block-three-items-with-image__item-title element--title-color\"])[1]"));
			  
			  // scroll till visibilty of web element
			  js.executeScript("arguments[0].scrollIntoView();",element);
			  Thread.sleep(5000);
			  
			  // scroll down the webpage at the bottom of the page
			  
			  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			  Thread.sleep(4000);
			  
			 
			  
			  //scroll by horizontally 
			  js.executeScript("window.scrollBy(500,0)"); 
			  Thread.sleep(4000);
			  //scroll up the webpage at the up of the page
			  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		  
	}

}
