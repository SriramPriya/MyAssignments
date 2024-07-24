package week3.day2;

public class JavaConnection extends MySqlConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaConnection obj = new JavaConnection();
		obj.executeQuery();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
	}

}
