package projects.project1.entity;

public class Task {
    private int id;
    private String taskTitle;
    private String taskDescription;
    private int priority;
    private  boolean status;

    public Task(int id, String taskTitle, String taskDescription, int priority) {
        this.id = id;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.status = false;
    }

    public int getId() {
        return id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isStatus() {
        return status;
    }
    public String getStatus(){
        if(status){
            return "completed";
        }else{
            return "needs to be completed";
        }
    }
    public void changeStatus(){
        status=true;
    }
}
