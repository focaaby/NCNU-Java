import java.util.Scanner;
class Node {
    int data;
    Node next;
}
public class LLStack {
    Node head;
    int size;
    public void add(int x) {
        Node tmp = new Node();
        tmp.data = x;
        if (tail != null) {
            tail.next = tmp;
            tail = tmp;
        } else {
            head = tail = tmp;
        }
        size++;
    }
    public void remove() {
        int x = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;   
        return x;
    }
    public boolean inEmpty() {
    }
}
