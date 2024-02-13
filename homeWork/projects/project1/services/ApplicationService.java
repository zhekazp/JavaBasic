package projects.project1.services;

import classes.UserInput;

public class ApplicationService {
    UserTalkService talk=new UserTalkService();
    TaskManager manager;
    public ApplicationService(int maxValueOfTasks, boolean automaticFill) {
        manager=new TaskManager(maxValueOfTasks,automaticFill);
        int exercise=0;
        while (exercise!=6){
            talk.menu();
            exercise=talk.answer();
            manage(exercise);
        }
    }
    private void manage(int exercise){
        switch (exercise){
            case -1:
                talk.error();
                break;
            case 1:
               talk.reportTaskCreation(manager.createTaskFromUserInput(talk.getNewTask()));
               break;
            case 2:
                int result=talk.getStatusId(manager.calendar.getCurrentId());
                if(result!=-1){
                    manager.changeStatus(result);
                }
                break;
            case 3:
                manager.sort();
                talk.reportSort();
                break;
            case 4:
                manager.printTasks();
                break;

        }
    }

}
