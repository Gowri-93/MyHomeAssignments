package week1.day3;

public class Library {

	public static void main(String[] args)
	{
		Library bookObj1 = new Library();
		bookObj1.addBook("NewBook");
		bookObj1.issueBook();
		}
	
	public String addBook(String bookTitle)
	{
		System.out.println( "Book added successfully");
				return bookTitle;
		
	}

	public void issueBook()
	{
				System.out.println("Book issued successfully");
		
		
	}
}
