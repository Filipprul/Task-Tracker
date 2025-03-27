//Einzelne Aufgaben
public class Task {
    private String title;
    private String description;
    private int taskID;
    private static int idCounter = 0;

    public Task(String title, String description){
        this.title = title;
        this.description = description;
        this.taskID = ++idCounter;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public int getTaskID(){
        return taskID;
    }
}
