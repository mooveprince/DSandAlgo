public class QueueUsingArray {

    public static void main (String[] args) {
        QueueImpl queue = new QueueImpl (3);

        queue.deQueue ();

        queue.queueItem ("Moove");
        queue.queueItem ("Surya");
        queue.queueItem ("Dhanya");

        queue.queueItem ("NewPerson");

        System.out.println (queue.deQueue());
        System.out.println (queue.deQueue());
        System.out.println (queue.deQueue());

        queue.queueItem ("NewPerson");

    }

}


class QueueImpl {

    String[] queuedStrings;
    int size;
    int rear;
    int front;

    QueueImpl (int size) {
        this.size = size;
        this.queuedStrings = new String[size];
        this.rear = -1;
        this.front = -1;
    }

    public void queueItem (String item) {
        if (!isQueueFull()) {
            rear++;
            queuedStrings[rear] = item;
            if (front == -1) front++ ;
        } else {
            System.out.println("Queue is Full");
        }
    }

    public String deQueue ( ) {
        String toBeRemoved = null;
        if (!isQueueEmpty()) {
            toBeRemoved = queuedStrings[front];
            front++;
        } else {
            System.out.println("Queue is Empty");
        }
        return toBeRemoved;
    }

    public boolean isQueueFull () {
        return rear+1 == size;
    }

    public boolean isQueueEmpty () {
        return rear == -1;
    }

}
