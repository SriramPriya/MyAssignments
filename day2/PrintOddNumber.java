package week1.day2;

public class PrintOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10; //Range is declared as 10
		int i;
		System.out.println("List of ODD numbers between 1 to 10 is ");
		
		for (i = 0; i< r ; i ++)
		{
			//Logic to find Odd
			if (i % 2 == 1)
			{
				System.out.print(i + ",");
			}
		}
	}

}
