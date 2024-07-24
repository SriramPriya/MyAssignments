package week3.day1;

public class Safari extends Edge{

	//method reader mode
	public void readerMode()
	{
		System.out.println("Reader Mode");
	}
	
	//method fullscreen mode
	public void fullScreenMode()
	{
		System.out.println("Full screen mode");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		Safari s = new Safari();
		
				//methods from browser class
				s.openUrl();
				s.closeBrowser();
				s.navigateBack();
				
				//methods from chrome class
				s.openIncognito();
				s.clearCache();
				
				//methods from edge class
				s.clearCookies();
				s.takeSnap();
				
				//methods from Safari class
				s.fullScreenMode();
				s.readerMode();
				
				//print variable
				System.out.println("Browser name is " +s.browserName);
				System.out.println("Browser version is" +s.browserVersion);
	
	}

}
