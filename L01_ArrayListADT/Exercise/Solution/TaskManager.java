package L01_ArrayListADT.Exercise.Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main( String[] args ) {
        ArrayList<String> tasks = new ArrayList<>( );
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Task Management Application" );
        System.out.println( "--------------------------" );

        int choice = 0;
        while ( choice != 4 ) {
            displayMenu( );
            System.out.print( "Enter your choice: " );
            choice = scanner.nextInt( );
            scanner.nextLine( ); // Consume the remaining newline character

            switch ( choice ) {
                case 1:
                    addTask( tasks, scanner );
                    break;
                case 2:
                    removeTask( tasks, scanner );
                    break;
                case 3:
                    displayTasks( tasks );
                    break;
                case 4:
                    System.out.println( "Exiting the program..." );
                    break;
                default:
                    System.out.println( "Invalid choice. Please try again." );
            }
        }

        scanner.close( );
    }

    private static void displayMenu( ) {
        System.out.println( "1. Add a task" );
        System.out.println( "2. Remove a task" );
        System.out.println( "3. Display all tasks" );
        System.out.println( "4. Exit" );
    }

    private static void addTask( ArrayList<String> tasks, Scanner scanner ) {
        System.out.print( "Enter the task description: " );
        String taskDescription = scanner.nextLine( );
        tasks.add( taskDescription );
        System.out.println( "Task added successfully!" );
        System.out.println( );
    }

    private static void removeTask( ArrayList<String> tasks, Scanner scanner ) {
        System.out.print( "Enter the index of the task to remove: " );
        int index = scanner.nextInt( );
        scanner.nextLine( ); // Consume the remaining newline character

        if ( index >= 0 && index < tasks.size( ) ) {
            String removedTask = tasks.remove( index );
            System.out.println( "Task \"" + removedTask + "\" removed successfully!" );
        } else {
            System.out.println( "Invalid index. No task removed." );
        }

        System.out.println( );
    }

    private static void displayTasks( ArrayList<String> tasks ) {
        System.out.println( "Tasks:" );
        for ( int i = 0; i < tasks.size( ); i++ ) {
            System.out.println( ( i + 1 ) + ". " + tasks.get( i ) );
        }
        System.out.println( );
    }
}