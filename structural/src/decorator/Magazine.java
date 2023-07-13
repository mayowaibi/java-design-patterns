package decorator;

public class Magazine extends LibraryItem {

	public Magazine(String title, String iSBN, String author) {
		super();
		this.title = title;
		ISBN = iSBN;
		this.author = author;
	}

	String title;
	String ISBN;
	String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Boolean borrow() {
		System.out.println("Item " + title + " cannot be borrowed");
		return false;
	}

	public Boolean reserve() {
		System.out.println("Item " + title + " cannot be reserved");
		return false;
	}
}
