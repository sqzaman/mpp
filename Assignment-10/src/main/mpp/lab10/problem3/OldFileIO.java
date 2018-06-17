package mpp.lab10.problem3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OldFileIO {
	public final static String FILE_LOCATION = "src/main/mpp/lab10/problem3/word_test.txt";

	void readText(String filename) throws IOException {
		File f = new File(filename);
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);

		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
	}

	public static void main(String[] args) {
		OldFileIO old = new OldFileIO();
		String filename = FILE_LOCATION;
		try {
			old.readText(filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
