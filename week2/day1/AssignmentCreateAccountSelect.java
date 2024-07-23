package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCreateAccountSelect {

	public static void main(String[] args) throws InterruptedException {
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
				driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("TCS");
				//description
				driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
				//Select "ComputerSoftware" as the industry.
				WebElement industryWE = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
				Select options = new Select(industryWE);
				options.selectByVisibleText("Computer Software");
				//Select "S-Corporation" as ownership using SelectByVisibleText.
				WebElement ownerWE = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
				Select options1 = new Select(ownerWE);
				options1.selectByVisibleText("S-Corporation");
				Thread.sleep(1000);
				//Select "Employee" as the source using SelectByValue.
				WebElement sourceWE = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
				Select options2 = new Select(sourceWE);
				options2.selectByValue("LEAD_EMPLOYEE");
				//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
				WebElement marketWE = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
				Select options3 = new Select(marketWE);
				options3.selectByIndex(5);
				//Select "Texas" as the state/province using SelectByValue.
				WebElement stateWE = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
				Select options4 = new Select(stateWE);
				options4.selectByValue("TX");
				//click submit
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				//get title
				String title = driver.getTitle();
				System.out.println(title);
	}

}
