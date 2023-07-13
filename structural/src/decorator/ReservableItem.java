package decorator;

public class ReservableItem extends Decorator {

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
	

	
	public ReservableItem(LibraryItem item) {
		super();
		this.libItemToDecorate = item;
	}

	public Boolean reserve() {
		System.out.println("Item " + libItemToDecorate.getTitle() + " is now reserved");
		return true;
	};
	
	
	
	
	
}
