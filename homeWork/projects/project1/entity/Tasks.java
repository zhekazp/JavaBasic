package projects.project1.entity;

public class Tasks {
    private int currentId;
    private int maxIds;
    private Task[] tasks;

    public Tasks(int maxIds) {
        this.maxIds = maxIds;
        tasks=new Task[maxIds];
        currentId=0;
    }

    public int getCurrentId() {
        return currentId;
    }

    public int getMaxIds() {
        return maxIds;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }
    public void saveNewTask(Task task){
        tasks[currentId-1]=task;
    }
}
