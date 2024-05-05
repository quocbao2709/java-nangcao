package L01_ArrayListADT.Exercise;

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
        // TODO: Put your code here
    }

    private static void removeTask( ArrayList<String> tasks, Scanner scanner ) {
        // TODO: Put your code here
    }

    private static void displayTasks( ArrayList<String> tasks ) {
        // TODO: Put your code here
    }
}