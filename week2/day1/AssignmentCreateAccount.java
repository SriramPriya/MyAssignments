package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize driver
		ChromeDriver driver = new ChromeDriver();
		//get URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Send username - DemoSalesManager
		driver.findElement(By.className("inputLogin")).sendKeys("DemoSalesManager");
		//Send password -crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click account
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		//click create account
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		//account name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("TEST LEAF");
		//description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		//number of employee
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("10");
		//site name
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		//click submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//get title
		String title = driver.getTitle();
		System.out.println(title);
	}

}
