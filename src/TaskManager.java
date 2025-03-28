import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

//Methoden von Aufgaben
public class TaskManager {
    Scanner scanner = new Scanner(in).useLocale(Locale.US);
    ArrayList<Task> itemList = new ArrayList<>();
    String titlestring = "Title: ";
    String description = ", Description: ";
    String taskid = ", Task ID: ";
    String taskwithid = "Task with the ID ";

    //1
    public void add(){
        out.print("Enter the title of the task: ");
        String title = scanner.nextLine();

        out.println("Enter the description of the task: ");
        String description = scanner.nextLine();

        itemList.add(new Task(title, description));
        for (Task task : itemList) {
            out.println("Task added successfully! (" + task.getTaskID() + ")");
        }
    }

    //2
    public void update(){
        out.print("Enter the Task ID to update: ");
        int taskID = scanner.nextInt();

        for (Task task : itemList){
            if (task.getTaskID() == taskID){
                out.print("Enter the new title of the task: ");
                String newtitle = scanner.nextLine();

                out.println("Enter the new description of the task: ");
                String newdescription = scanner.nextLine();

                task.setTitle(newtitle);
                task.setDescription(newdescription);
                task.setCreateAt(LocalDate.now());

                out.println("Task updated successfully! (" + task.getTaskID() + ")");
                return;
            }
        }
    }

    //3
    public void delete(){
        out.print("Enter the task ID to delete: ");
        int IDtoDelete = scanner.nextInt();


        for (Task task : itemList){
            if (task.getTaskID() == IDtoDelete){
                itemList.remove(IDtoDelete);
                out.println("Task deleted successfully! (" + IDtoDelete + ")");
                return;
            } else {
                out.println(taskwithid + IDtoDelete + " not found!");
            }
        }
    }

    //4
    public void markinprogress(){
        out.print("Enter the task ID to mark as in progress: ");
        int progressID = scanner.nextInt();

        for (Task task : itemList){
            if (task.getTaskID() == progressID){
                task.setStatus("In Progress");
                out.println("Status was successfully marked as in progress! (" + task.getTaskID() + ")");
                return;
            } else {
                out.println(taskwithid + progressID + " not found!  ");
            }
        }
    }

    //5
    public void markdone(){
        out.print("Enter the task ID to mark as done: ");
        int doneID = scanner.nextInt();


        for (Task task : itemList){
            if (task.getTaskID() == doneID){
                task.setStatus("Done");
                out.println("Status was successfully marked as done! (" + task.getTaskID() + ")");
                return;
            } else {
                out.println(taskwithid + doneID + " not found!  ");
            }
        }
    }

    //6
    public void list(){
        for (Task task : itemList){
            out.println(titlestring + task.getTitle() + description + task.getDescription() + taskid + task.getTaskID() + ", Status: " + task.getStatus());
        }
    }

    //7
    public void taskalldone(){
        for (Task task : itemList){
            if (task.getStatus() == "Done") {
                out.println(titlestring + task.getTitle() + description + task.getDescription() + taskid + task.getTaskID());
            } else {
                out.println("No tasks marked as done found!  ");
            }
        }
    }

    //8
    public void tasknotdone(){
        for (Task task : itemList){
            if (task.getStatus() != "Done"){
                out.println(titlestring + task.getTitle() + description + task.getDescription() + taskid + task.getTaskID());
            } else {
                out.println("No tasks not marked as done found!  ");
            }
        }
    }

    //9
    public void taskallinprogress(){
        for (Task task : itemList){
            if (task.getStatus() == "In Progress") {
                out.println(titlestring + task.getTitle() + ", Description: " + task.getDescription() + taskid + task.getTaskID());
            } else {
                out.println("No tasks marked as in Progress found!");
            }
        }
    }
}
