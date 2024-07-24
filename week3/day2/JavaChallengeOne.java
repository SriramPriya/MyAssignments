package week3.day2;

public class JavaChallengeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input String
		String s = "Hello World";
		
		//Find the Last space
		int lastSpaceIndex = s.lastIndexOf(' ');
		
		//Calculate the length of last word
		int lastWord = s.length()-lastSpaceIndex-1;
		
		//Output
		System.out.println("The last word is WORLD with length: " +lastWord);
	}

}
