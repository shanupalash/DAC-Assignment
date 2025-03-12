import java.util.ArrayList;

public class LibraryManagement {
	String name ;
	String address ;
	Books[] b;
	 int bookCount;
	
	
	public LibraryManagement(String name, String address, int capacity) {
		
		this.name = name;
		this.address = address;
		this.b = new Books[capacity];
	    this.bookCount = 0;
	} 
	
	public void addBook(Books book) {
		if(bookCount < b.length) {
			b[bookCount]= book;
			bookCount++;
		} else {
            System.out.println("Library is at full capacity.");
        }
		
	}
	public void displayBooks(){
		for(int i =0;i<b.length;i++) {
			b[i].displayBook();
			
		}
		
	}
	public void searchBook(String title){
		
	}

}
