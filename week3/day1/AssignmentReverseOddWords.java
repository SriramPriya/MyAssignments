package week3.day1;

public class AssignmentReverseOddWords {

	public static void main(String[] args) {
        String input = "I am a software tester";
        String output = reverseOddPositionWords(input);
        System.out.println(output); // Output: I ma a erawtfos tester
    }
    
    public static String reverseOddPositionWords(String input) {
        // Split the input string into an array of words
        String[] words = input.split(" ");
        
        // Traverse through each word using loop
        for (int i = 0; i < words.length; i++) {
            // Check if the word is at an odd position (1, 3, 5,...)
            if (i % 2 != 0) {
                // Reverse the word at odd position
                words[i] = reverseString(words[i]);
            }
        }
        
        // Join the words array back into a single string
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }
        
        // Remove the trailing space and return the result
        return result.toString().trim();
    }
    
    // Helper method to reverse a string
    private static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
}
