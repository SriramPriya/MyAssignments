package week2.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array declaration
		int num[] = {2,5,7,7,5,9,2,3};
		
		//Sorting of Array
		Arrays.sort(num);
		
		//Getting length of an array
		int length = num.length;
		
		//Print statement
		System.out.println("Duplicate number are listed below");
		
		//Logic to find duplicate 
		for(int i =0; i<num.length-1;i++)
		{
			if (num[i] == num [i+1])
			{
				
				System.out.println(num[i]);
			}
		}
		
	}

}









