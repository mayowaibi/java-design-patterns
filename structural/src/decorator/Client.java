package decorator;

public class Client {

	public static void main(String[] args) {
		
		Book b1 = new Book("Book 1", "ISBN-1234", "KK");
		Book b2 = new Book("Book 2", "ISBN-8888", "DN");
		
		Magazine m1 = new Magazine("Magazine 1", "ISBN-7890", "IK");
		Magazine m2 = new Magazine("magazine 2", "ISBN-1234", "KK");
		
		Boolean result = b1.borrow();
		result = b1.reserve();
		
		BorrowableItem borrowableItem1 = new BorrowableItem(b1);
		result = borrowableItem1.borrow();
		
		result = borrowableItem1.reserve();
		
		ReservableItem reservableItem1 = new ReservableItem(borrowableItem1);
		
		result = reservableItem1.borrow();
		result = reservableItem1.reserve();
		
		result = m1.borrow();
		BorrowableItem borrowableItem2 = new BorrowableItem(m1);
		borrowableItem2.borrow();
	}
}
