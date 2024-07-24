package week3.day1;

public class AssignmentSubClassTextField extends AssignmentBaseClassWebElement {

	public void getText()
	{
		System.out.println("getText Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentSubClassTextField obj = new AssignmentSubClassTextField();
		
		//method inherited from base class
		obj.click();
		obj.setText();
		obj.getText();
	

	}

}
