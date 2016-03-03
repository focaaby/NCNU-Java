import java.util.Scanner;
class Node {
    int data;
    Node next;
 }
public class LLStack {
    Node head;
    int size;
    public void add(int x) {
        Node tmp = bew Node();
        tmp.data = x;
        tmp.next = head;
        head = tmp;
        size++;
    }
    public void remove() {
        int x = head.data;
        head = head.next;
        return x;
    }
    public boolean inEmpty() {
    }
}
