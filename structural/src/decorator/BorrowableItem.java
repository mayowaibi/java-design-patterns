package decorator
;

public class BorrowableItem extends Decorator {

	private LibraryItem libItemToDecorate;

	public String getTitle() {
		return libItemToDecorate.getTitle();
	}

	public String getISBN() {
		return libItemToDecorate.getISBN();
	}

	public String getAuthor() {
		return libItemToDecorate.getAuthor();
	}

	public LibraryItem getLibItemToDecorate() {
		return libItemToDecorate;
	}

	public void setLibItemToDecorate(LibraryItem libItemToDecorate) {
		this.libItemToDecorate = libItemToDecorate;
	}

	public BorrowableItem(LibraryItem item) {
		super();
		this.libItemToDecorate = item;

		// TODO Auto-generated constructor stub
	}

	public Boolean borrow() {
		System.out.println("Item " + libItemToDecorate.getTitle() + " is now borrowed");
		return true;
	};

	

}
