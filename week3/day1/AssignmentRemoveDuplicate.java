package week3.day1;

public class AssignmentRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] textArray = text.split(" ");
		int textLength = textArray.length;	
		for(int i = 0; i<textLength ; i++)
		{
			for(int j = i+1; j<textLength ; j++)
			{
				count = 1;
				if(textArray[i].equalsIgnoreCase(textArray[j]))
				{
					textArray[j] = "";
					count++;
				}
			}
		}
		
		StringBuilder output = new StringBuilder();
		for(String result : textArray)
		{
			if(!result.isEmpty()) 
			{
				output.append(result).append(" ");
			}
		}
		
		System.out.println(output.toString().trim());
	}
}
		