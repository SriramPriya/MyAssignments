package week1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
	
		//Object for class 'Browser'
		Browser cObj = new Browser();
		
		//Calling Method 1 of Class 'Browser'
		String name = cObj.launchBrowser("Chrome");
		System.out.println("Browser name is " + name);
		
		//Calling Method 2 of Class 'Browser'
		cObj.loadUrl();
	}
	}

