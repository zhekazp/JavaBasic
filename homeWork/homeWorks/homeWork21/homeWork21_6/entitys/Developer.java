package homeWorks.homeWork21.homeWork21_6.entitys;

public class Developer extends Employee{
    String[] tasks;
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }
    public void saveTasks(String[] tasks){
        this.tasks=new String[tasks.length];
        for (int i=0;i<tasks.length;i++){
            this.tasks[i]=tasks[i];
        }
    }
    public void printProjects(){
        super.printInfo();
        System.out.println("This developer has projects : ");
        for (String project : tasks) {
            System.out.println(project);

        }
    }
}
