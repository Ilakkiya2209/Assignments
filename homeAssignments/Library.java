package homeAssignments;

public class Library {

	public String addBook(String bookTitle) {
		return bookTitle;
		

	}
	public void issueBook() {
	System.out.println("Book issued successfully");	

	}
	public static void main(String[] args) {
		Library ls = new Library();
		System.out.println(ls.addBook("Book added successfully"));
		ls.issueBook();
	}

}
