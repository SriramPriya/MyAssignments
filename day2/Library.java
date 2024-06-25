package week1.day2;

public class Library {
	
	//Methods 1 : Add Book
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return (bookTitle);
	}

	//Method 2: is Issue
	public void isIssue()
	{
		System.out.println("Book is issued Successfully");
	}

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object creation for class 'Library
		Library book = new Library();

		//Calling method 1
		String bookName = book.addBook("Do it Today");
		System.out.println("Book name is : " + bookName);

		//Calling method 2
		book.isIssue();
	}

}
