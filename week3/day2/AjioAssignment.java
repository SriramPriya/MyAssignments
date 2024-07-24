package week3.day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjioAssignment {

	public static void main(String[] args) throws AWTException, InterruptedException{
		// TODO Auto-generated method stub

		//driver Intilization
		ChromeDriver driver = new ChromeDriver();
		
		//launch URL
		driver.get("https://www.ajio.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//search box
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bag");
		
		//hit enter
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//check box - fashion bags
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='Men - Fashion Bags']"))).click();
		
		//check box - men
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='Men']"))).click();
		
		//item count
		WebElement countWE = driver.findElement(By.xpath("//div[@class='length']"));
		String count = countWE.getText();
		String countItem = count.replace("(^0-9)", "");
		System.out.println("Item count is " +countItem);
		
		//print brands name
		List<WebElement> brand = driver.findElements(By.className("brand"));
		System.out.println("*******Brands are listed below:********");
		for(WebElement brands : brand)
		{
			System.out.println(brands.getText());
		}
	 //print product names
		List<WebElement> product = driver.findElements(By.className("nameCls"));
		System.out.println("*******Product names are listed below:******** ");
		for(WebElement products : product)
		{
			System.out.println(products.getText());
		}
	}

}
