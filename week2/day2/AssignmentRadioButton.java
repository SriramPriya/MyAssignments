package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//Initialize Chrome Driver
				ChromeDriver driver = new ChromeDriver();
				
				//Load URL
				driver.get("https://www.leafground.com/radio.xhtml");
						
				//Maximize the window
				driver.manage().window().maximize(); 
				
				//select favourite browser
				driver.findElement(By.xpath("//label[text()='Chrome']")).click();
				
				//select & unselect
				driver.findElement(By.xpath("//label[text()='Chennai']")).click();
				System.out.println("Selected");
				
				driver.findElement(By.xpath("//label[text()='Chennai']")).click();
				System.out.println("Un Selected");
				
				//print default selected button name
				WebElement defaultWE = driver.findElement(By.xpath("//label[text()='Safari']"));
				String defaultValue = defaultWE.getText();
				System.out.println(defaultValue);
				
				WebElement selected = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
				boolean result = selected.isSelected();
				System.out.println(result);
				
				
	}

}
