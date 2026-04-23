package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/radio-button");

//driver.findElement(By.xpath("//label[@for=\"yesRadio\"]")).click();
Thread.sleep(2000);
WebElement radio=driver.findElement(By.xpath("//label[@for=\"impressiveRadio\"]"));
radio.click();

// boolean enable=radio.isEnabled();
// System.out.println(enable);
// 
//
// boolean display=radio.isDisplayed();
// System.out.println(display);
// 
// 
// boolean select=radio.isSelected();
// System.out.println(select);

 
 String text=radio.getText();
 System.out.println(text);
	
 
 String tagname=radio.getTagName();
 System.out.println(tagname);
 
 String attribute=radio.getAttribute("for");
 System.out.println(attribute);
 
 
 Dimension dimensions = radio.getSize();
 System.out.println("Height :" + dimensions.height + "Width : "+ dimensions.width);

	}

}
