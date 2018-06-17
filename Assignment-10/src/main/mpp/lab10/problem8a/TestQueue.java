package mpp.lab10.problem8a;




public class TestQueue {
	final Queue q = new Queue();
	Runnable r = () -> {
		q.add(0);
		q.add(0);
		q.remove();
	
	};
	public static void main(String[] args) {
		TestQueue mtt = new TestQueue();
		for(int i = 0; i < 100; ++i) {
			mtt.multipleCalls();
			//new Thread(mtt.r).start();	
		}
		// if it is correct, the number of elements in the queue is 100. 
		// However, the result is not exactly 100 and if you run it multiple time
		// you will see count is different in different iteration, its not stable
		System.out.println("Number of elements in the queue: " + mtt.q.count());
	}

	public void multipleCalls() {
		for(int i = 0; i < 500; ++i) {		
			new Thread(r).start();		
		}		
	}
	

}
