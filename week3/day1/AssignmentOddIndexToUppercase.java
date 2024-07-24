package week3.day1;

public class AssignmentOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String input ="changeme";
	//Convert into char array
	char[] charArray = input.toCharArray();
	
	for (int i = charArray.length-1; i>=0; i--)
	{
		if(i%2 != 0)
		{
		charArray[i] = Character.toUpperCase(charArray[i]);
		}
	}
	
		
System.out.println(new String(charArray));
	}

}
