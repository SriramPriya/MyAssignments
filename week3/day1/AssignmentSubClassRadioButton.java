package week3.day1;

public class AssignmentSubClassRadioButton extends AssignmentSubClassButton{

	public void selectRadioButton()
	{
		System.out.println("selectRadioButton method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentSubClassRadioButton obj = new AssignmentSubClassRadioButton();
		
		//method inherited from subclass
		obj.submit();
		
		//method inherited from base class
		obj.click();
		obj.setText();
		

	}

}
