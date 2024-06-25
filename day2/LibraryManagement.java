package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object creation for Class 'Library'
		Library book1 = new Library();
		
		//Calling Method 1 from Class 'Library'
		String bookName = book1.addBook("Do it Today");
		System.out.println("Book name is : " + bookName);
		
		//Calling Method 2 from Class 'Library'
		book1.isIssue();
	}

}
