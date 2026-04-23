package WindowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabndWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
System.out.println("First page "+driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		System.out.println("Second page " +driver.getTitle());
		//use for switch on new tab
	driver.switchTo().newWindow(WindowType.WINDOW);
	Thread.sleep(4000);//use for switch new window
		driver.get("https://www.facebook.com");
		System.out.println("Third page " +driver.getTitle());
		
		
		Set<String> windowhandles=driver.getWindowHandles();
		//String mainWindow=driver.getWindowHandle();
	List<String> handles=new ArrayList<String>();
	handles.addAll(windowhandles);
	
	Thread.sleep(4000);
	
	    driver.switchTo().window(handles.get(1));
	    System.out.println("Second page "+driver.getTitle());
	    Thread.sleep(4000);
	    
	    driver.switchTo().window(handles.get(0));
	    System.out.println("Third page "+driver.getTitle());
	    Thread.sleep(4000);
	    driver.quit();
	}

}
