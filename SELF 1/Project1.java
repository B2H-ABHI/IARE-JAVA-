//I'm trying of making a small project from my own with all previous knowledge and a few things that i learnt myself...
//DAY 1
import java.util.Scanner;

public class Project1 {
	static String[] tasks = new String[10];
	static boolean[] completed = new boolean[10];
	static int taskCount = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		System.out.println("================================");
		System.out.println("       MY STUDY TASK MANAGER");
		System.out.println("================================");

		while (true) {
			showMenu();
			System.out.print("Choose an option: ");
			choice = readNumber(scanner);

			if (choice == 1) {
				addTask(scanner);
			} else if (choice == 2) {
				showTasks();
			} else if (choice == 3) {
				completeTask(scanner);
			} else if (choice == 4) {
				showSummary();
			} else if (choice == 5) {
				System.out.println("\nGood luck with your studies!");
				break;
			} else {
				System.out.println("Please choose a number from 1 to 5.");
			}
		}

		scanner.close();
	}
    

	static void showMenu() {
		System.out.println("\n1. Add a task");
		System.out.println("2. Show all tasks");
		System.out.println("3. Complete a task");
		System.out.println("4. Show progress");
		System.out.println("5. Exit");
	}

	static int readNumber(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.print("Enter a number: ");
			scanner.next();
		}
		return scanner.nextInt();
	}

	static void addTask(Scanner scanner) {
		if (taskCount == tasks.length) {
			System.out.println("The task list is full.");
			return;
		}

		scanner.nextLine();
		System.out.print("Enter your task: ");
		String task = scanner.nextLine();
//DAY 2
		if (task.trim().isEmpty()) {
			System.out.println("A task cannot be empty.");
		} else {
			tasks[taskCount] = task;
			completed[taskCount] = false;
			taskCount++;
			System.out.println("Task added successfully!");
		}
	}

	static void showTasks() {
		if (taskCount == 0) {
			System.out.println("\nThere are no tasks yet.");
			return;
		}

		System.out.println("\nYour tasks:");
		for (int index = 0; index < taskCount; index++) {
			String status = completed[index] ? "DONE" : "TODO";
			System.out.println((index + 1) + ". [" + status + "] " + tasks[index]);
		}
	}

	static void completeTask(Scanner scanner) {
		showTasks();

		if (taskCount == 0) {
			return;
		}

		System.out.print("Enter the task number to complete: ");
		int taskNumber = readNumber(scanner);

		if (taskNumber >= 1 && taskNumber <= taskCount) {
			completed[taskNumber - 1] = true;
			System.out.println("Task marked as complete!");
		} else {
			System.out.println("That task number does not exist.");
		}
	}

	static void showSummary() {
		int completedCount = 0;

		for (int index = 0; index < taskCount; index++) {
			if (completed[index]) {
				completedCount++;
			}
		}

		System.out.println("\n========== PROGRESS ==========");
		System.out.println("Total tasks: " + taskCount);
		System.out.println("Completed: " + completedCount);

		if (taskCount == 0) {
			System.out.println("Start by adding your first task!");
		} else if (completedCount == taskCount) {
			System.out.println("Amazing! All tasks are complete.");
		} else {
			System.out.println("Keep going, you are making progress!");
		}
	}
}

//COMPLETED AT DAY 2