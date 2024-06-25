package week1.day2;

public class Browser {
	
	//Method 1 : Launch Browser
	public String launchBrowser(String browserName)
	{
	System.out.println("Browser Launched successfully");
	return browserName;
	}
	
	//Method 2 : Load URL
	public void loadUrl()
	{
		System.out.println("Application URL loaded successfully");

	}

	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object creation for Class 'Browser'
		Browser bObj = new Browser();
		
		//Calling Method 1
		String name = bObj.launchBrowser("Chrome");
		System.out.println("Browser name is "+ name);
		
		//Calling Method 2
		bObj.loadUrl();
	}

	
}
