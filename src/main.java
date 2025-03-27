import java.util.Locale;
import java.util.Scanner;

//Hauptprogramm
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in)).useLocale(Locale.US);
        TaskManager manager = new TaskManager();

        while (true){
            System.out.println("\nHome: ");
            System.out.println("1. Add a task: ");
            System.out.println("2. Update a task: ");
            System.out.println("3. Delete a task:");
            System.out.println("4. Mark the task as in progeress: ");
            System.out.println("5. Mark the task as done: ");
            System.out.println("6. List all tasks: ");
            System.out.println("7. List all tasks which are done");
            System.out.println("8. List all tasks which aren't done");
            System.out.println("9. List all tasks which are in progress");
            System.out.println("10. Exit");
            System.out.println("Selection: ");

            int choice;
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            switch (choice){
                case 1:
                    // Add a task
                    break;
                case 2:
                    // Update a task
                    break;
                case 3:
                    // Delete a task
                    break;
                case 4:
                    // Mark the task as in progress
                    break;
                case 5:
                    // Mark the task as done
                    break;
                case 6:
                    // List all tasks
                    break;
                case 7:
                    // List all tasks which are done
                    break;
                case 8:
                    // List all tasks which aren't done
                    break;
                case 9:
                    // List all tasks which are in progress
                    break;
                case 10:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }
}
