package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize Webdriver
		ChromeDriver driver = new ChromeDriver();
		
		//Loadurl
		driver.get("http://leaftaps.com/opentaps/.");
		
		//Maximize
		driver.manage().window().maximize();
		
		//Send username - DemoSalesManager
		driver.findElement(By.className("inputLogin")).sendKeys("DemoSalesManager");
		
		//Send password -crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on link
		driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();
		
		//Click on Leads button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//click find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//click phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("00");
		
		//click find lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//get lead id
		WebElement leadId = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String leadIDnum = leadId.getText();
		System.out.println("lead id is " +leadIDnum);

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click the first entry
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		
		//click delete button
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		//click find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//enter lead id
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadIDnum);
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		//click find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
	}

}
