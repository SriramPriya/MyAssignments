package week3.day1;

public class AssignmentSingleInheritenceSubClassLoginTestData extends AssignmentSingleInheritenceSuperClassTestData {
	
	public void enterUsername()
	{
		System.out.println("Sub class method 1 : Enter user name");
	}
	
	public void Password()
	{
		System.out.println("Sub class method 2: Password");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentSingleInheritenceSubClassLoginTestData obj = new AssignmentSingleInheritenceSubClassLoginTestData();
		
		//method inherited from super class
		obj.enterCredentials();
		obj.navigateToHomePage();
		
		//method from subclass
		obj.enterUsername();
		obj.Password();

	}

}
