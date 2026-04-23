package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sampleEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//         WebDriver driver=new ChromeDriver();
		 WebDriver driver=new FirefoxDriver();
//		 WebDriver driver=new EdgeDriver();
		 
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 String extTitle="Swag Labs";
		 System.out.println(extTitle);
		String actTitle= driver.getTitle();
		 System.out.println(actTitle);
		 if(extTitle.equals(actTitle))
		 {
			 System.out.println("test passed");
		 }
		 else
		 {
			 System.out.println("test failed");
		 }
		 
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 
		 String  sourcecode=driver.getPageSource();
		 System.out.println(sourcecode);
		 
		 Thread.sleep(3000);
		 
		 driver.close();
		 
	}

}
