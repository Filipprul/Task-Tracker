import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//Methoden von Aufgaben
public class TaskManager {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    ArrayList<Task> itemList = new ArrayList<>();

    //1
    public void add(){
        System.out.print("Enter the title of the task: ");
        String title = scanner.nextLine();

        System.out.println("Enter the description of the task: ");
        String description = scanner.nextLine();

        itemList.add(new Task(title, description));
        for (Task task : itemList) {
            System.out.println("Task added successfully! (" + task.getTaskID() + ")");
        }
    }

    //2
    public void update(){
        System.out.print("Enter the Task ID to update: ");
        int taskID = scanner.nextInt();

        for (Task task : itemList){
            if (task.getTaskID() == taskID){
                System.out.print("Enter the new title of the task: ");
                String newtitle = scanner.nextLine();

                System.out.println("Enter the new description of the task: ");
                String newdescription = scanner.nextLine();

                task.setTitle(newtitle);
                task.setDescription(newdescription);
                task.setCreateAt(LocalDate.now());

                System.out.println("Task updated successfully! (" + task.getTaskID() + ")");
                return;
            }
        }
    }

    //3
    public void delete(){
        System.out.print("Enter the task ID to delete: ");
        int IDtoDelete = scanner.nextInt();


        for (Task task : itemList){
            if (task.getTaskID() == IDtoDelete){
                itemList.remove(IDtoDelete);
                System.out.println("Task deleted successfully! (" + IDtoDelete + ")");
                return;
            } else {
                System.out.println("Task with the ID " + IDtoDelete + " not found!");
            }
        }
    }

    //4
    public void markinprogress(){
        System.out.print("Enter the task ID to mark as in progress: ");
        int progressID = scanner.nextInt();

        for (Task task : itemList){
            if (task.getTaskID() == progressID){
                task.setStatus("In Progress");
                System.out.println("Status was successfully marked as in progress! (" + task.getTaskID() + ")");
                return;
            } else {
                System.out.println("Task with the ID " + progressID + " not found!  ");
            }
        }
    }

    //5
    public void markdone(){
        System.out.print("Enter the task ID to mark as done: ");
        int doneID = scanner.nextInt();


        for (Task task : itemList){
            if (task.getTaskID() == doneID){
                task.setStatus("Done");
                System.out.println("Status was successfully marked as done! (" + task.getTaskID() + ")");
                return;
            } else {
                System.out.println("Task with the ID " + doneID + " not found!  ");
            }
        }
    }

    //6
    public void list(){
        for (Task task : itemList){
            System.out.println("Title: " + task.getTitle() + ", Description: " + task.getDescription() + ", Task ID: " + task.getTaskID() + ", Status: " + task.getStatus());
        }
    }

    //7
    public void taskalldone(){
        for (Task task : itemList){
            if (task.getStatus() == "Done") {
                System.out.println("Title: " + task.getTitle() + ", Description: " + task.getDescription() + ", Task ID: " + task.getTaskID());
            } else {
                System.out.println("No tasks marked as done found!  ");
            }
        }
    }

    //8
    public void tasknotdone(){
        for (Task task : itemList){
            if (task.getStatus() != "Done"){
                System.out.println("Title: " + task.getTitle() + ", Description: " + task.getDescription() + ", Task ID: " + task.getTaskID());
            } else {
                System.out.println("No tasks not marked as done found!  ");
            }
        }
    }

    //9
    public void taskallinprogress(){
        for (Task task : itemList){
            if (task.getStatus() == "In Progress") {
                System.out.println("Title: " + task.getTitle() + ", Description: " + task.getDescription() + ", Task ID: " + task.getTaskID());
            } else {
                System.out.println("No tasks marked as in Progress found!");
            }
        }
    }
}
