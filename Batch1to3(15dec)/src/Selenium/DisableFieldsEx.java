package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DisableFieldsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		Thread.sleep(2000);
		driver.get("https://proposalfinder.com/create-wedding-profile");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@value='Edit'])[1]")).click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement gender=driver.findElement(By.id("cp-gender"));
		js.executeScript("arguments[0].removeAttribute(\"disabled\")", gender);
	
		Select s1 = new Select(gender);
		s1.selectByVisibleText("Male");
		
		
		WebElement reli=driver.findElement(By.id("cp-religion"));
		js.executeScript("arguments[0].removeAttribute('disabled')", reli);
		Select reg = new Select(reli);
		reg.selectByVisibleText("Hindu");
		
	}

}
