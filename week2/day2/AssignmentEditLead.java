package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentEditLead {

	public static void main(String[] args) throws InterruptedException {
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
		
		//Click on create lead- Xpath with tag name
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Company name- xpath with index
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TEST LEAF");
		
		//First name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("TEST");
		
		//Last name
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("LEAF");
		
		//First name local
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("TEST");
		
		//Department Name
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("TUTOR");
		
		//Description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("SELENIUM BATCH");
		
		//primary Email
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("TEST.LEAF@GMAIL.COM");
		
		//State - Newyork - select from dropdown
		WebElement options = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select select = new Select(options);
		select.selectByVisibleText("New York");
		
		//Click submit
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Click edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//clear description
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		
		//important note
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("IMPORTANT NOTE");
		
		//click update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Close browser
		driver.close();
		
	}

}
