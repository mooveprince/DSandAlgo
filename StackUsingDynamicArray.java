import java.util.*;

public class StackUsingDynamicArray {

    public static void main (String[] args) {
        StackImpl stackImpl = new StackImpl ();

        stackImpl.push ("Moove");
        System.out.println ("First Item Added");
        stackImpl.push ("Surya");
        System.out.println ("Second Item Added");
        stackImpl.push ("Dhanya");
        System.out.println ("Third Item Added");

        while (stackImpl.top >= 0) {
            System.out.println (stackImpl.pop());
        }
    }

}

class StackImpl {

    int top;
    String[] stackArray;

    StackImpl () {
        this.top = -1;
        this.stackArray = new String[1];
    }

    public boolean isStackFull () {
        return (top+1) < stackArray.length ? false : true;
    }

    public void increaseStackSize ( ) {
        stackArray = Arrays.copyOf(stackArray, stackArray.length * 2);
    }

    public boolean isStackEmpty () {
        return stackArray.length == 0 ? true : false;
    }

    public void push (String str) {
        if (this.isStackFull()) {
            System.out.println("Time to increase the size");
            this.increaseStackSize ();
        }
        top ++;
        stackArray[top] = str;
    }

    public String pop () {
        String removedItem = null;
        if ( !isStackEmpty()) {
            removedItem = stackArray[top];
            top--;
        }

        return removedItem;
    }

}