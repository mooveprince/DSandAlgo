public class SimpleHashTableTest {

    public static void main (String[] args) {
        HashTableImpl impl = new HashTableImpl ( );

        impl.addItem (1, "Moove");
        impl.addItem (2, "Surya");
        impl.addItem (3, "Dhanya");
        impl.addItem (4, "Kani");
        impl.addItem (5, "Elan");
        impl.addItem (6, "Shanthi");
        impl.addItem (7, "Moovendhan");
        impl.addItem (8, "Periasamy");
        impl.addItem (9, "Karunanithi");
        impl.addItem (10, "Maha");
        impl.addItem (11, "Ramasamy");
        impl.addItem (12, "Dinesh");
        impl.addItem (13, "Kumar");
        impl.addItem (14, "Moovendhan");

        //impl.iterateHashTable ();

        System.out.println("Identfied Value = " + impl.getItem(6).value);
    }
}


class HashTableImpl {

    static Node [] hashIndexList = new Node [4];

    public static int hashAlgorithm (int key) {
        return key % hashIndexList.length ;
    }

    public void addItem (int key, String value) {
        int hashIndex = hashAlgorithm (key);
        Node toBeAdded = new Node (key, value);

        if ( hashIndexList[hashIndex] == null ) {
            hashIndexList[hashIndex] = toBeAdded;
        } else {
            toBeAdded.nextNode = hashIndexList[hashIndex];
            hashIndexList[hashIndex] = toBeAdded;
        }
    }

    public Node getItem (int key) {
        int hashIndex = hashAlgorithm (key);
        Node head = hashIndexList[hashIndex];
        Node identifedNode = null;

        while (head != null) {
            if (key == head.key) {
                return head;
            }
            head = head.nextNode;
        }

        return identifedNode;
    }

    public void iterateHashTable ( ) {

        for (int i =0; i < hashIndexList.length; i++) {
            Node n = hashIndexList[i];
            while (n != null) {
                System.out.print ( n.key + " : " + n.value + "<---");
                n = n.nextNode;
            }
            System.out.println ("");
        }
    }
}


class Node {
    int key;
    String value;
    Node nextNode;

    Node (int key, String value) {
        this.key = key;
        this.value = value;
        this.nextNode = null;
    }
}