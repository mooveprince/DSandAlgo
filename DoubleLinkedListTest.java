
public class DoubleLinkedListTest {

    public static void main (String[] args) {
        DoubleLinkedList dls = new DoubleLinkedList ( );

        dls.addItem ("Dhanya");
        dls.addItem ("Surya");
        dls.addItem ("Moove");

        dls.iterateItems();

        System.out.println("After deleting");
        dls.deleteItems();
        dls.iterateItems();
    }
}

class DoubleLinkedList {
    Node head;

    public void addItem (String item) {
        Node nodeToBeAdded = new Node (item);
        if (head == null) {
            head = nodeToBeAdded;
        } else {
            head.prevNode = nodeToBeAdded;
            nodeToBeAdded.nextNode = head;
            head = nodeToBeAdded;
        }
    }

    public void iterateItems () {
        Node n = head;

        while (n != null) {
            System.out.println(n.value +" --> ");
            n = n.nextNode;
        }
    }

    public void deleteItems () {
        head = head.nextNode;
    }

}

class Node {
    Node prevNode;
    String value;
    Node nextNode;

    Node (String value) {
        this.value = value;
    }
}