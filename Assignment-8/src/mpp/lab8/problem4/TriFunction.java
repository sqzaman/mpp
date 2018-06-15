package mpp.lab8.problem4;

@FunctionalInterface
public interface TriFunction<F, S, T, R> {	
	public R apply(F first, S second, T third);  
}
