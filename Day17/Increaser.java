public class Increaser implements Runnable {
	private Counter c;

	public Increaser(Counter counter) {
		this.c = counter;
	}

	public static void main(String args[]) {
		Counter counter = new Counter(); //the main method is only run the first time. so there is 1 counter object
		for (int i = 0; i < 100; i++) {
			Increaser increaserTask = new Increaser(counter);
			Thread t = new Thread(increaserTask);
			t.start();
		}
	}

	public void run() {
		synchronized (c){
			System.out.println("Starting at " + c.getCount());
			for (int i = 0; i < 1000; i++) {
				c.increase();
			}
			System.out.println("Stopping at " + c.getCount());
			return;
		}
	}
}


