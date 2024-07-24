package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class AssignmentMissingElemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array declaration
		int[] a = {1, 2, 3, 4, 10, 6, 8};
		
		//Array sort
		Arrays.sort(a);
		
		//Print array value
		System.out.println("The sorted Array is: " +Arrays.toString(a));
		
		//comparison
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] + 1 != a[i+1])
			{
				int missing = a[i]+1;
				System.out.println("The missing number is: " +missing);
			}
		}

	}

}
