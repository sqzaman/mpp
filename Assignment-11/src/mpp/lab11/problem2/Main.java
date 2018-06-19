package mpp.lab11.problem2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void reverse(List<?> list) {
		Collections.reverse(list);
	}

	public static void main(String[] args) {
		List list = Arrays.asList(1, 2, 3);
		reverse(list);

		System.out.println(list);
	}
}
