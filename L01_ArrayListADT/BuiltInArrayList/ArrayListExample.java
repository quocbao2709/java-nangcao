package L01_ArrayListADT.BuiltInArrayList;

import java.util.ArrayList;

class Student {
    private String name;
    public Student( String name ) {
        this.name = name;
    }
    public String getName( ) {
        return name;
    }
    public void setName( String name ) {
        this.name = name;
    }
    @Override
    public String toString( ) {
        return name;
    }
}


public class ArrayListExample {
    public static void main( String[] args ) {
        /*
            Integer Array List
         */
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>( );

        // Add elements to the ArrayList
        numbers.add( 10 );
        numbers.add( 20 );
        numbers.add( 30 );

        // Access elements in the ArrayList
        int firstNumber = numbers.get( 0 );
        System.out.println( "First number: " + firstNumber );

        // Update an element in the ArrayList
        numbers.set( 1, 25 );

        // Remove an element from the ArrayList
        numbers.remove( 2 );

        // Iterate over the elements in the ArrayList
        for ( int number : numbers ) {
            System.out.println( "Number: " + number );
        }

        // Check if the ArrayList contains a specific element
        boolean containsTwenty = numbers.contains( 20 );
        System.out.println( "Contains 20? " + containsTwenty );

        // Get the size of the ArrayList
        int size = numbers.size( );
        System.out.println( "Size: " + size );

        // Clear all elements from the ArrayList
        numbers.clear( );

        // Check if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty( );
        System.out.println( "Is empty? " + isEmpty );

        /*
            Student Array List
         */
        ArrayList<Student> studentList = new ArrayList<>( );
        studentList.add( new Student( "John" ) );
        studentList.add( new Student( "David" ) );
        studentList.add( new Student( "Lucy" ) );
        studentList.add( new Student( "Ben" ) );
        System.out.println( studentList );
        System.out.println( "Index of `Ben` is " + studentList.indexOf( new Student( "Ben" ) ) );
    }
}