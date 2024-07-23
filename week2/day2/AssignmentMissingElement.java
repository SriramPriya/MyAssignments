package week2.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssignmentMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array declaration
		int[] a = {1,4,3,2,8,6,7};
		
		//array sorting
		Arrays.sort(a);
		
		//List
		List<Integer> missingNum = new ArrayList<>();
		
		for (int i=0; i<a.length-1; i++)
		{
		for(int j=a[i]+1; j<a[i+1];j++)
			
			{
				missingNum.add(j);
				
			}
		}
			System.out.println(missingNum);	
		}
	}


