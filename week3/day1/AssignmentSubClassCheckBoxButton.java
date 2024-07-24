package week3.day1;

public class AssignmentSubClassCheckBoxButton extends AssignmentSubClassButton{

	public void clickCheckButton()
	{
		System.out.println("clickCheckButton method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentSubClassCheckBoxButton obj = new AssignmentSubClassCheckBoxButton();
		
		//method inherited from base class
		obj.click();
		obj.setText();
		
		//Method inherited from subclass
		obj.clickCheckButton();
		obj.submit();
	}

}
