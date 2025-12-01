// LinkedListDemo.java
// Java program implementing a linked list for storing student records

class Node {
    String name;
    int id;
    Node next;

    Node(String name, int id) {
        this.name = name;
        this.id = id;
        this.next = null;
    }
}

public class LinkedListDemo {
    Node head;

    public void insert(String name, int id) {
        Node newNode = new Node(name, id);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println("Student ID: " + current.id + ", Name: " + current.name);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.insert("Alice", 101);
        list.insert("Bob", 102);
        list.printList();
    }
}
