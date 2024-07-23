package week2.day1;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Browser Initialization
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://leafground.com/checkbox.xhtml");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click on the Basic check box - Finding web element by attribute based x path
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		//Click on the Notification check box
		driver.findElement(By.xpath("//div=[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		//
	}

}
