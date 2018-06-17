package mpp.lab9.problem9;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book("Test", 3);
		List<BookCopy> copies = book.getCopies();
		
		//copies.forEach(cp -> cp.changeAvailability());
		
		System.out.println(book.isAvaiable());
	}

}
