public class QueueUsingLinkedList {

    public static void main (String[] args) {
        QueueImpl queue = new QueueImpl ();

        System.out.println (queue.deQueue() != null ? queue.deQueue().value:"");
        queue.enQueue("Moove");
        queue.enQueue ("Surya");
        queue.enQueue ("Dhanya");
        System.out.println (queue.deQueue().value);
        System.out.println (queue.deQueue().value);
        System.out.println (queue.deQueue().value);

        System.out.println (queue.deQueue() != null ? queue.deQueue().value:"");

    }

}


class QueueImpl {
    Node firstNode;
    Node lastNode;

    QueueImpl ( ) {
        this.firstNode = null;
        this.lastNode = null;
    }

    boolean isQueueEmpty () {
        return firstNode == null;
    }

    void enQueue (Object item) {
        Node toBeAdded = new Node (item);

        if (firstNode == null) {
            firstNode = toBeAdded;
            lastNode = toBeAdded;
        } else {
            toBeAdded.nextNode = lastNode;
            lastNode.prevNode = toBeAdded;
            lastNode = toBeAdded;
        }
    }

    Node deQueue () {
        Node removedNode = null;
        if (! isQueueEmpty ()) {
            removedNode = firstNode;
            firstNode = firstNode.prevNode;
        } else {
            System.out.println ("Queue is Empty");
        }
        return removedNode;
    }

}


class Node {

    Node prevNode;
    Object value;
    Node nextNode;

    Node (Object value) {
        this.value = value;
        this.prevNode = null;
        this.nextNode = null;
    }

}