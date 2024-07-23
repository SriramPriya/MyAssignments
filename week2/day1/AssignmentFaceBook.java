package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize driver
		ChromeDriver driver = new ChromeDriver();
		//get URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//new account
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		//first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sriram Priya");
		//lastname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Velraja");
		//mobile
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8056520529");
		//newpassword
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Good@001");
		//Day
		WebElement dayWE = driver.findElement(By.xpath("//select[@id='day']"));
		Select options = new Select(dayWE);
		options.selectByValue("12");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Month
		WebElement monthWE = driver.findElement(By.xpath("//select[@id='month']"));
		Select options1 = new Select(monthWE);
		options1.selectByValue("7");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//year
		WebElement yearWE = driver.findElement(By.xpath("//select[@id='year']"));
		Select options2 = new Select(yearWE);
		options2.selectByValue("1991");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//gender
		driver.findElement(By.xpath("//input[@value='1']")).click();
	}

}
