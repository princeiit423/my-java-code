package LinkedList;

//in this code we write all the function of linked list (i.e add at first element , last element, remove certain element , etc)

public class createLinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // step-1 create node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        // step -2 add newnode next to head
        newNode.next = head;
        // step-3 head=newnode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        createLinkedList ll = new createLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

    }
}
