public class Increaser2 implements Runnable {
	private Counter c;
	private static Object obj = new Object(); //must be static so each thread can access the same one, not one each

	public Increaser2(Counter counter) {
		this.c = counter;
	}

	public static void main(String args[]) {
		Counter counter = new Counter();
		for (int i = 0; i < 100; i++) {
			Increaser2 increaserTask = new Increaser2(counter);
			Thread t = new Thread(increaserTask);
			t.start();
		}
	}

	public void run() {
		synchronized (obj){    //why does this work with c but not object?
			System.out.println("Starting at " + c.getCount());
			for (int i = 0; i < 1000; i++) {
				c.increase();
			}
			System.out.println("Stopping at " + c.getCount());
			return;
		}
	}
}


