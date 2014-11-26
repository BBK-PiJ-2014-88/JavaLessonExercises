public class ResponsiveIU{
	public static void main(String[] args){
		ResponsiveIU launcher = new ResponsiveIU();
		launcher.launch();
	}
	public void launch(){
		int[] completedTasks = new int[11];
		for (int x = 1; x < 11; x++){
			System.out.println("Enter the duration (in ms) of task " + x + ":");
			int miliseconds = Integer.parseInt(System.console().readLine());

			for (int y = 1; y <11; y++){
				if (completedTasks[y] != 0){
					System.out.println("Finished Tasks: " + completedTasks[y]);
					completedTasks[y] = 0;
				}
			}
			Runnable task = new Task(miliseconds, x, completedTasks);
			Thread t = new Thread(task);
			t.start();

		}
	}
}