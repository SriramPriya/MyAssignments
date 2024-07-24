package week3.day1;

public class AssignmentOverridingSubClassLoginPage extends AssignmentOverridingBasePage{
	
	public void performCommonTasks()
	{
		System.out.println("Over riddden - Sub class Method: performCommonTasks ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AssignmentOverridingSubClassLoginPage obj = new AssignmentOverridingSubClassLoginPage();
		//Base class methods
		obj.clickElement();
		obj.enterText();
		obj.findElement();
		
		//Over ridden method
		obj.performCommonTasks();


	}

}
