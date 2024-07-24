package week3.day1;

public class AssignmentSubClassButton extends AssignmentBaseClassWebElement{
	
	public void submit()
	{
		System.out.println("Submit Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AssignmentSubClassButton obj = new AssignmentSubClassButton();
		
		//method inherited from base class
		obj.click();
		obj.setText();
		obj.submit();

	}

}
