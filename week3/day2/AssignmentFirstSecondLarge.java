package week3.day2;

import java.util.Arrays;

public class AssignmentFirstSecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a = {3, 2, 11, 4, 6, 7};
    Arrays.sort(a);
    System.out.println("The sorted Array is " +Arrays.toString(a));
    int secondLarge = a[1];
    System.out.println("The second largest number is " +secondLarge);
	}

}
