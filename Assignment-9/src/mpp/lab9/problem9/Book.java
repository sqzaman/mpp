package mpp.lab9.problem9;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Book {
	private List<BookCopy> copies = new ArrayList<BookCopy>();
	private String title;

	public Book(String title, int numCopies) {
		if (numCopies < 1)
			throw new IllegalArgumentException("NumCopies must be positive");
		this.title = title;
		for (int i = 0; i < numCopies; ++i) {
			addCopy();
		}
	}

	public List<BookCopy> getCopies() {
		return copies;
	}

	public void addCopy() {
		BookCopy copy = new BookCopy(this, copies.size() + 1, true);
		copies.add(copy);
	}
	
	public boolean isAvaiable() {
		// 1st way
		// return copies.stream().filter(bc -> bc.isAvailable()).findFirst().isPresent();
		// 2nd way
		 return copies.stream().map(c -> c.isAvailable()).reduce(false, (c1, c2) -> c1|| c2);
		
	}
}
