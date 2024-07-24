package week3.day1;

public class Browser {
	
	//variable declartion
	String browserName = "Chrome";
	int browserVersion = 11;
	
	//method openURL
	public void openUrl()
	{
		System.out.println("URL is opened");
	}
	
	//method close browser
	public void closeBrowser()
	{
		System.out.println("Browser is closed");
	}
	
	//method navigateback
	
	public void navigateBack()
	{
		System.out.println("Navigate back");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation
		Browser b = new Browser();
		b.openUrl();
		b.closeBrowser();
		b.navigateBack();
		
		//print variable
				System.out.println("Browser name is " +b.browserName);
				System.out.println("Browser version is" +b.browserVersion);
	}

}
