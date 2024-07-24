package week3.day1;

public class Edge extends Chrome {

	//method take snap
	public  void takeSnap()
	{
		System.out.println("Take snap");
	}
	
	//method clear cookies
	public void clearCookies()
	{
		System.out.println("Clear Cookies");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		Edge e = new Edge();
		
		//methods from browser class
		e.openUrl();
		e.closeBrowser();
		e.navigateBack();
		
		//methods from chrome class
		e.openIncognito();
		e.clearCache();
		
		//methods from edge class
		e.clearCookies();
		e.takeSnap();
		
		//print variable
		System.out.println("Browser name is " +e.browserName);
		System.out.println("Browser version is" +e.browserVersion);
	
	}

}
