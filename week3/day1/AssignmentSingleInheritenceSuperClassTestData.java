package week3.day1;

public class AssignmentSingleInheritenceSuperClassTestData {
	
	public void enterCredentials()
	{
		System.out.println("Superclass method 1 : enterCredentials");
	}

	public void navigateToHomePage()
	{
		System.out.println("Superclass method 2 : navigateToHomePage");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentSingleInheritenceSuperClassTestData obj = new AssignmentSingleInheritenceSuperClassTestData();
		obj.enterCredentials();
		obj.navigateToHomePage();
		

	}

}
