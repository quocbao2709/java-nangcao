package TaskBuddy;

import java.util.ArrayList;

public class TaskBuddy {
    // data members
    private ArrayList<Task> pendingTasks;
    private ArrayList<Task> completedTasks;
    private int taskId;
    // constructor
    public TaskBuddy(){
        pendingTasks = new ArrayList<>(  );
        completedTasks = new ArrayList<>(  );
        taskId = 1;
    }

    // methods
    public void addTask(String description, String priority){
        Task task = new Task(taskId, description,priority  );
        pendingTasks.add( task );
        taskId++;
    }

    public void displayTasks(){
        System.out.println("Task list:" );
        for(int i = 0; i < pendingTasks.size() ; i++){
            System.out.println( pendingTasks.get(i) );
        }
    }
    public void completeTask(int taskId){

        Task completedTask = null;

        for(int i = 0; i < pendingTasks.size(); i++){
            Task task = pendingTasks.get( i );
            if(task.getId() == taskId){
                completedTask = task;
            }
        }

        if(completedTask != null){
            pendingTasks.remove(completedTask);
            completedTasks.add(completedTask);
        } else {
            System.out.println( "Task " + taskId + " does not exist." );
        }



    }
}
