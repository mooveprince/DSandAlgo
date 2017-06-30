import java.util.*;

public class DynamicArray<T> {
    
    private int size;   //will be incremented, if an element is added to data array
    public T[] data;

    public DynamicArray ( ) {
        size = 0;
        data = (T[])new Object [1];
    }

    public int getSize ( ) {
        return data.length;
    }

    public T getItemAtIndex (int i) {
        return data[i];
    }

    public void put (T item) {
        System.out.println("Number of items actually added " + size);
        if (checkIfSpaceIsAvailable()) {
            data[size] = item;
            size++;
        } else {
            System.out.println("Space is not available. Double the array size");
            data = Arrays.copyOf(data, getSize()*2);
            System.out.println("length of copied " + data.length);
            data[size] = item;         
            size++;
        }
    }

    public boolean checkIfSpaceIsAvailable ( ) {
        boolean isSpaceAvailable = false;
        if (data.length > size) {
            System.out.println("Space is available.");
            isSpaceAvailable = true;
        }
        return isSpaceAvailable;
    }

    public static void main (String[] args) {
        DynamicArray dyArray = new DynamicArray ( );
        dyArray.put("Check");
        dyArray.put("Check_2");
        dyArray.put("Check_3");

        System.out.println(dyArray.getItemAtIndex(0));
        System.out.println(dyArray.getSize());
        System.out.println(dyArray.getItemAtIndex(2));
    }

}