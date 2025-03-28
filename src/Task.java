import java.time.LocalDate;

//Einzelne Aufgaben
public class Task {
    private String title;
    private String description;
    private int taskID;
    private static int idCounter = 0;
    private String status;
    private LocalDate createAt;
    private LocalDate updateAt;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.taskID = ++idCounter;
        this.createAt = LocalDate.now();
    }

    public Task(String title, String description, String status){
        this(title, description);
        this.status = status;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public int getTaskID(){
        return taskID;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public LocalDate getCreateAt(){
        return createAt;
    }
    public void setCreateAt(LocalDate createAt){
        this.createAt = updateAt;
    }
}
