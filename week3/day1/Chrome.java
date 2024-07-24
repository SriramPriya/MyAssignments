package week3.day1;

public class Chrome extends Browser{
	
	//method open incognito
	public void openIncognito()
	{
		System.out.println("Open Incognito");
	}
	
	//method clear cache
	
	public void clearCache()
	{
		System.out.println("Clear Cache");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		Chrome c = new Chrome();
		
		//methods from Browser class
		c.openUrl();
		c.navigateBack();
		c.closeBrowser();
		
		//methods from chrome class
		c.clearCache();
		c.openIncognito();
		
		//print variable
		System.out.println("Browser name is " +c.browserName);
		System.out.println("Browser version is" +c.browserVersion);
	} 

}
