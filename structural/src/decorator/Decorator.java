package decorator;

public abstract class Decorator extends LibraryItem {
	
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
	

}
