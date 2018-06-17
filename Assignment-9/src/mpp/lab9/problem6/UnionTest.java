package mpp.lab9.problem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionTest {
	public static void main(String[] args) {
		List<Set<String>> list = new ArrayList<>();
		Set<String> a = new HashSet<String>();
		a.add("A");
		a.add("B");

		Set<String> b = new HashSet<String>();
		b.add("D");
		
		Set<String> c = new HashSet<String>();
		c.add("1");
		c.add("3");
		c.add("5");

		list.add(a);
		list.add(b);
		list.add(c);
		
		System.out.println(new UnionTest().union(list));
	}
	public Set<String> union(List<Set<String>> sets){
		
		//return sets.stream().flatMap(e -> e.stream()).collect(Collectors.toSet());
		
		return sets.stream()
				.map(set -> set.stream())
				.reduce((s1, s2) -> Stream.concat(s1, s2))
				.get()
				.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
				.collect(Collectors.toSet());
		
	}
}
