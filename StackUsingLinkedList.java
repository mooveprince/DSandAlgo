public class StackUsingLinkedList {

    public static void main (String[] args) {
        StackImpl stack = new StackImpl ();

        stack.push ("Moove");
        stack.push ("Surya");
        stack.push ("Dhanya");

        while (stack.head != null) {
            System.out.println (stack.pop().value);
        }

    }

}


class StackImpl {

    Node head;

    void push (String value) {
        Node toBeAdded = new Node (value);
        if (head == null) {
            head = toBeAdded;
        } else {
            toBeAdded.nextNode = head;
            head = toBeAdded;
        }
    }

    Node pop () {
        Node deletedNode = head;
        head = head.nextNode;
        return deletedNode;
    }

}


class Node {
    String value;
    Node nextNode;

    Node (String value) {
        this.value = value;
        this.nextNode = null;
    }
}