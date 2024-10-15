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

    public void print() { // O(n)
        Node temp = head;
        if (head == null) {
            System.out.println("linked list is empty");
        }
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("--------------------------------------------");
        return;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(int size) {
        if (size == 0) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        createLinkedList ll = new createLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.add(1, 7);
        ll.print();
        ll.removeFirst(4);
        ll.print();
        System.out.println(ll.recSearch(3));

    }
}
