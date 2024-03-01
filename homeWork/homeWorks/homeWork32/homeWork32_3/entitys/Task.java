package homeWorks.homeWork32.homeWork32_3.entitys;

public class Task {
    String nameOfTask;
    int priority;

    public Task(String nameOfTask, int priority) {
        this.nameOfTask = nameOfTask;
        this.priority = priority;
    }

    public String getNameOfTask() {
        return nameOfTask;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "nameOfTask='" + nameOfTask + '\'' +
                ", priority=" + priority +
                '}';
    }
}
