package L01_ArrayListADT;

public class ArrayList implements AbstractArrayList {
    private int[] elements = new int[ 5 ];
    private int index = 0;

    @Override
    public boolean add( int element ) {
        this.elements[ index ] = element;
        this.index = this.index + 1;
        return true;
    }
    @Override
    public boolean add( int index, int element ) {
        // 1: move data to the right -> loop
        for ( int i = this.index; i > index; i-- ) {
            elements[ i ] = elements[ i - 1 ];
        }

        // 2: insert new data
        elements[ index ] = element;
        this.index = this.index + 1;

        return true;
    }
    @Override
    public int get( int index ) {
        return this.elements[ index ];
    }
    @Override
    public int set( int index, int element ) {
        int temp = this.elements[ index ];
        this.elements[ index ] = element;
        return temp;
    }
    @Override
    public int remove( int index ) {
        int temp = this.elements[ index ];

        for ( int i = index; i < this.index; i++ ) {
            elements[ i ] = elements[ i + 1 ];
        }

        elements[ this.index - 1 ] = 0;
        this.index = this.index - 1;

        return temp;
    }
    @Override
    public int size( ) {
        return this.index;
    }
    @Override
    public int indexOf( int element ) {
        int result = -1;
        for ( int i = 0; i < this.index; i++ ) {
            if ( elements[ i ] == element ) {
                result = i;
                break;
            }
        }
        return result;
    }
    @Override
    public boolean contains( int element ) {
        boolean result = false;
        for ( int i = 0; i < this.index; i++ ) {
            if ( elements[ i ] == element ) {
                result = true;
                break;
            }
        }
        return result;
    }
    @Override
    public boolean isEmpty( ) {
        if ( size( ) == 0 ) { // if empty returns true
            return true;
        } else { // if not empty returns false
            return false;
        }
    }
}

class ArrayListRunner {
    public static void main( String[] args ) {
        ArrayList myArr = new ArrayList( );

        // System.out.println( myArr.size( ) ); // 0
        // System.out.println( myArr.isEmpty( ) ); // true

        myArr.add( 10 );
        myArr.add( 20 );
        myArr.add( 30 );

        // System.out.println( myArr.set( 2, 70 ) ); // 30
        // System.out.println( myArr.get( 2 ) ); // 70
        //
        // System.out.println( myArr.size( ) ); // 5
        // System.out.println( myArr.isEmpty( ) ); // false

        myArr.add( 1, 50 );

        // [10,50,20,30,0]
        // myArr.remove( 2 );

        System.out.println( myArr.indexOf( 50 ) ); // 1
        System.out.println( myArr.indexOf( 70 ) ); // -1
        System.out.println( myArr.contains( 70 ) ); // false
        System.out.println( myArr.contains( 10 ) ); // true

    }
}