package DatePickerEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		
		WebElement date=driver.findElement(By.id("datePickerMonthYearInput"));
		date.click();
		
		Select year=new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByVisibleText("2000");
		
		Select month=new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText("June");
		
		driver.findElement(By.xpath("//div[@aria-label=\"Choose Tuesday, June 13th, 2000\"]")).click();
		
	}

}
