package week3.day2;

public class FindOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "TestLeaf";
		int count =0;
		
		char[] inputArray = input.toCharArray();
		for(int i =0; i<inputArray.length;i++)
		{
			if(inputArray[i] =='e')
			count++;
		}
		System.out.println("The count of character e in the word TestLeaf is " + ":" +count);
	}

}
