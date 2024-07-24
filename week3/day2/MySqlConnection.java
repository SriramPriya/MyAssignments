package week3.day2;

public class MySqlConnection implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void executeQuery()
	{
		System.out.println("Execute Query");
	}
	@Override
	public void connect() {
		System.out.println("Connection Established");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute Update");
		
	}
}