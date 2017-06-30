public class StackUsingArray {

    public static void main (String[] args) {
        Stack stackImpl = new Stack(3);

        stackImpl.addItem ("Moove");
        stackImpl.addItem ("Surya");
        stackImpl.addItem ("Dhanya"); 

        stackImpl.printStack();

        stackImpl.deleteItem();
        System.out.println("After Deleting");
        stackImpl.printStack();

        stackImpl.addItem("Danny");
        System.out.println("Inserting Back Deleting");
        stackImpl.printStack();
    }

}

class Stack {

    String[] strStack;
    int top;

    Stack (int size) {
        strStack = new String[size];
        top = -1;
    }

    public void addItem (String str) {
        if (top < strStack.length) {
            top ++;
            strStack[top] = str;
        }
    }

    public void deleteItem () {
        strStack[top] = null;
        top --;
    }

    public void printStack () {
        for (int i=(strStack.length-1); i>=0; i--) {
            System.out.println (strStack[i]);
        }
    }

}
