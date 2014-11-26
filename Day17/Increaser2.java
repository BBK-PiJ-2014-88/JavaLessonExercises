public class Increaser2 implements Runnable {
	private Counter c;
	static Object obj = new Object();  //using a static object so all objects will have the same one makes it work

	public Increaser(Counter counter) {
		this.c = counter;
	}

	public static void main(String args[]) {
		Counter counter = new Counter();
		for (int i = 0; i < 100; i++) {
			Increaser increaserTask = new Increaser(counter);
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


