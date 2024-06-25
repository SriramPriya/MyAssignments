package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int r = 8; // Range is declared as 8
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		for(i = 0; i < r ; i++)
		{
			//Print the output
			System.out.print(n1 + ",");
			
			//fibanocci series logic
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
	
		}
	}

}
