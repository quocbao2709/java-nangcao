package L01_ArrayListADT;

public interface AbstractArrayList {
    boolean add( int element ); // Adds the specified element to the list
    boolean add( int index, int element ); // Inserts the specified element at the specified index in the list
    int get( int index ); // Returns the element at the specified index.
    int set( int index, int element ); // Replaces the element at the specified index with the specified element
    int remove( int index ); // Removes the element at the specified index from the list
    int size( ); // Returns the number of elements in the list.
    int indexOf( int element ); // Returns the index of the first occurrence of the specified element in the list
    boolean contains( int element ); // Checks if the list contains the specified element
    boolean isEmpty( ); // Checks if the list is empty
}
