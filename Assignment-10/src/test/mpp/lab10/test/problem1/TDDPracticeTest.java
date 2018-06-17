package mpp.lab10.test.problem1;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import mpp.lab10.problem1.TDDPractice;


public class TDDPracticeTest {
	public TDDPracticeTest() {

	}

	@Test
	public void testChangeLastCharToUpper() {
		List<String> list = Arrays.asList("Babu", "Zaman");

		List<String> result = TDDPractice.changeLastCharToUpper(list);
		assertTrue(result.size() == list.size());
		assertTrue(result.get(0).equals("BabU"));
		assertTrue(result.get(1).equals("ZamaN"));
	}
}
