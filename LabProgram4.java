import java.util.Scanner;
class Book{
	private String book_name;
	private long ISBN_Number;
	private String author_name;
	private String publisher;
	
	String getBook_name() {
		return book_name;
	}
	void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	long getISBN_Number() {
		return ISBN_Number;
	}
	void setISBN_Number(long ISBN_Number) {
		this.ISBN_Number = ISBN_Number;
	}
	String getAuthor_name() {
		return author_name;
	}
	void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	String getPublisher() {
		return publisher;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	void details() {
		System.out.println("BookName:"+getBook_name()+"\nISBN number:"+getISBN_Number()+"\nAuthor name:"+getAuthor_name()+"\n"
				+ "Publisher:"+getPublisher());
	}
}
public class LabProgram4 {

	private static Scanner sc;

	public static void main(String[] args) {

		Book b[]=new Book[30];
		sc = new Scanner(System.in);
		int n,i,isbn;
		String author,publisher,name;
		System.out.print("Enter the number of books:");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			b[i]=new Book();
			System.out.println("Enter Book "+(i+1)+" Details");
			System.out.print("Enter the name of book:");
			name=sc.next();
			b[i].setBook_name(name);
			System.out.print("Enter the ISBN of book:");
			isbn=sc.nextInt();
			b[i].setISBN_Number(isbn);
			System.out.print("Enter the name of author:");
			author=sc.next();
			b[i].setAuthor_name(author);
			System.out.print("Enter the publisher:");
			publisher=sc.next();
			b[i].setPublisher(publisher);
			}
		for(i=0;i<n;i++) {
			System.out.println("Book-"+(i+1)+" Details");
			b[i].details();
		}
		sc.close();
	}
}
