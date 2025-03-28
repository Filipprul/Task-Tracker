import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

//Hauptprogramm
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((in)).useLocale(Locale.US);
        TaskManager manager = new TaskManager();

        while (true){
            out.println("\nHome: ");
            out.println("1. Add a task: ");
            out.println("2. Update a task: ");
            out.println("3. Delete a task:");
            out.println("4. Mark the task as in progeress: ");
            out.println("5. Mark the task as done: ");
            out.println("6. List all tasks: ");
            out.println("7. List all tasks which are done");
            out.println("8. List all tasks which aren't done");
            out.println("9. List all tasks which are in progress");
            out.println("10. Exit");
            out.println("Selection: ");

            int choice;
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                out.print("Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            switch (choice){
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.update();
                    break;
                case 3:
                    manager.delete();
                    break;
                case 4:
                    manager.markinprogress();
                    break;
                case 5:
                    manager.markdone();
                    break;
                case 6:
                    manager.list();
                    break;
                case 7:
                    manager.taskalldone();
                    break;
                case 8:
                    manager.tasknotdone();
                    break;
                case 9:
                    manager.taskallinprogress();
                    break;
                case 10:
                    out.println("Exiting...");
                    return;
                default:
                    out.println("Invalid selection. Please try again.");
            }
        }
    }
}
