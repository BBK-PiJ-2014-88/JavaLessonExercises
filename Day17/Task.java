public class Task implements Runnable{
	private int miliseconds;
	private int[] completedTasks;
	private int taskNumber;

	public Task(int miliseconds, int taskNumber, int[] completedTasks){
		this.miliseconds = miliseconds;
		this.taskNumber = taskNumber;
		this.completedTasks = completedTasks;
	}

	public void run(){
		try{
			Thread.sleep(miliseconds);
			completedTasks[taskNumber] = this.taskNumber;
		}
		catch (InterruptedException ex){
		}

	}
}