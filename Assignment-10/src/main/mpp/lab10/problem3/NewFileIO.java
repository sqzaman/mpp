package mpp.lab10.problem3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class NewFileIO {
	public final static String FILE_LOCATION = "src/main/mpp/lab10/problem3/word_test.txt";

	void readText(String filename) throws IOException {
		BufferedReader reader =  new BufferedReader(new FileReader(filename));
		Stream<String> lines = reader.lines();
		lines.forEach(System.out::println);
		reader.close();
	}

	public static void main(String[] args) {
		NewFileIO old = new NewFileIO();
		String filename = FILE_LOCATION;
		try {
			old.readText(filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
