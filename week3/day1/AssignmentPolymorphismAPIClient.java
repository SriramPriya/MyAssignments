package week3.day1;

public class AssignmentPolymorphismAPIClient {

	//method 1
	public void sendRequest(String endPoint)
	{
		System.out.println("The End point is " +endPoint);
	}
	
	//method 2
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus)
	{
		System.out.println("The End point is " +endPoint + "," +"The request body is "+requestBody +"," +"The Request status is "+requestStatus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object
		AssignmentPolymorphismAPIClient a = new AssignmentPolymorphismAPIClient();
		
		//method 1 is called
		a.sendRequest("END POINT");
		
		//method 2 is called
		a.sendRequest("END POINT", "REQUEST BODY", false);
	}

}
