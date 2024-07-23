package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//To launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//To get URL
		driver.get("https://www.facebook.com");
		
		//To maximize
		driver.manage().window().maximize();
		
		//To wait'
		Thread.sleep(2000);
		
		//To give username
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//To give password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//To click loginbutton
		driver.findElement(By.name("login")).click();
		
		//To click link
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		//To print web page title
		System.out.println(driver.getTitle());
		//To close;
		//driver.cloe();
	}

}

//