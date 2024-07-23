package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://leafground.com/checkbox.xhtml");
				
		//Maximize the window
		driver.manage().window().maximize(); 
				
		//Basic check box
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		
		//Notification check box
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		
		Thread.sleep(1000);
		//Validate verification message
		WebElement textElement = driver.findElement(By.xpath("//div[@class='ui-growl ui-widget']/div/div/div/span"));
		String verifyMsg = textElement.getText().trim();
		System.out.println(verifyMsg);
		
		//Select language
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		//select Tri state checkbox
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
		
		Thread.sleep(1000);
		//Tristate check validation
		WebElement textElement1 = driver.findElement(By.xpath("//div[@class='ui-growl ui-widget'][2]/div/div/div/p"));
		String verifyMsg1 = textElement1.getText().trim();
		System.out.println(verifyMsg1);
		
		//Toggle Switch on
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();
		
		Thread.sleep(1000);
		//Toggle switch validation
		WebElement textElement2 = driver.findElement(By.xpath("//div[@class='ui-growl ui-widget'][2]/div/div/div/span"));
		String verifyMsg2 = textElement2.getText().trim();
		System.out.println(verifyMsg2);
		
		//Check disabled check box
		Boolean textElement3 = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isEnabled();
		System.out.println("Check Box disabled" +textElement3);
		
		//Select from option
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id='j_idt87:multiple']"));
		String option = "London";
		String option1 = "Berlin";
		for (int i = 0; i < allOptions.size(); i++) 
		{
			if (allOptions.get(i).getText().contains(option)) 
			{
				allOptions.get(i).click();
			}
			
			if (allOptions.get(i).getText().contains(option1)) 
			{
				allOptions.get(i).click();
			}
		}
		
		driver.close();
	}
	}
