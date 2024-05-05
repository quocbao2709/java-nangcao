package TaskBuddy;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskBuddyRunner {
    public static void main( String[] args ) {
        TaskBuddy myTaskBuddy = new TaskBuddy();

        Scanner sc = new Scanner( System.in);

        int choice = 0;
        boolean running = true;

        while ( running ){
            System.out.println( );
            System.out.println( "TaskBuddy Application" );
            System.out.println("1. Add a task" );
            System.out.println("2. Display all tasks" );
            System.out.println("3. Complete a task" );
            System.out.println("4. Exit" );
            System.out.println( );
            System.out.print("Enter your choice: " );

            choice = Integer.parseInt( sc.nextLine() );

            switch ( choice ){
                case 1:
                    System.out.print("Enter the task description: " );
                    String taskDescription = sc.nextLine();
                    System.out.print("Enter the task priority [A/B/C]: " );
                    String taskPriority = sc.nextLine();
                    myTaskBuddy.addTask( taskDescription, taskPriority);
                    System.out.println( "Task added successfully!" );
                    break;
                case 2:
                    myTaskBuddy.displayTasks();
                    break;
                case 3:
                    System.out.print("Enter a taskID to complete: " );
                    int taskId = Integer.parseInt( sc.nextLine() );
                    myTaskBuddy.completeTask( taskId );
                    break;
                case 4:
                    System.out.println( "Exiting the program..." );
                    running = false;
                    break;
                default:
                    System.out.println( "Invalid choice. Please try again." );
                    break;
            }
        }

    }
}
