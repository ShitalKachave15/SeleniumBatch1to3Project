package DatePickerEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickernext {
	
static	String ExpYear="2021";
static	String ExpMonth="August";
	static String Expdate="10";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Datepicker.html");
driver.findElement(By.id("datepicker1")).click();

while(true)
{
	String ActYear=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
	String ActMonth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
	
	if(ActYear.equals(ExpYear) && (ActMonth.equalsIgnoreCase(ExpMonth)))
	{
		List<WebElement> daylist=driver.findElements(By.xpath("//table//tbody//tr//td"));
		for(WebElement e:daylist) {
			String day=e.getText();
			if(day.equals(Expdate))
			{
			e.click();
				break;	
			}
			
		}
		Thread.sleep(4000);
        break;
      
		 
	}
	else
	{
		driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
	}

}

	}

}
