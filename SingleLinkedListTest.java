public class SingleLinkedListTest {

    public static void main (String[] args) {
        SingleLinkedList ls = new SingleLinkedList ();

        ls.addItem("Moove");
        ls.addItem("Surya");
        ls.addItem("Dhanya");

        ls.iterateList ();

        ls.removeItem();
        System.out.println("After removing the item");
        ls.iterateList();
    }

}


class SingleLinkedList {
    Node head;

    public void addItem (String item) {
        Node toBeAddedNode = new Node (item);
        if (head == null)
            head = toBeAddedNode;
        else {
            toBeAddedNode.nextNode = head;
            head = toBeAddedNode;
        }   
    }

    public void removeItem() {
        head = head.nextNode;
    }

    public void iterateList ( ) {
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " --> ");
            n = n.nextNode;
        }
    }

}

class Node {

    String value;
    Node nextNode;

    Node (String value ) {
        this.value = value;
        this.nextNode = null;
    }

}

