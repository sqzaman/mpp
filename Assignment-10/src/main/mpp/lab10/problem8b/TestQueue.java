package mpp.lab10.problem8b;




public class TestQueue {
	final Queue q = new Queue();
	Runnable r = () -> {
		q.add(0);
		q.add(0);
		q.remove();
	
	};
	public static void main(String[] args) {
		TestQueue mtt = new TestQueue();
		for(int i = 0; i < 10; ++i) {
			mtt.multipleCalls();
			//new Thread(mtt.r).start();	
		}
		// if it is correct, the number of elements in the queue is 100. 
		// However, the result is not exactly 5000 but close to 5000 and its more consistent
		System.out.println("Number of elements in the queue: " + mtt.q.getCount());
	}

	
	public void multipleCalls() {
		for(int i = 0; i < 500; ++i) {		
			new Thread(r).start();		
		}		
	}
}
