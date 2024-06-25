package week1.day2;

public class PalindromeOrNot 

{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		int n = 121; //Input number
		int m = n;
		int i;
		int rm;
		int rv = 0;
	
	for (i = 0; i < 3 ; i ++)
	{
		rm = m % 10 ; //Remainder value
		rv = rv*10 + rm; //Reversed value
		m = m/10;
	}
	// Print 
	System.out.println("The reversed number is " + rv);
	
	if (rv == n)
	{
		System.out.println("The given number is palindrome");
	}
	else
	{
		System.out.println("The given number is Not a palindrome");
	}
	}
}
