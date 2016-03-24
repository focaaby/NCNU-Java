/*   addEdge(1, 3) -> addEdge(1, 0) -> addEdge(1, 2)
 *      ____
 *  0  |____| -> 1
 *  1  |____| -> 2 -> 0 -> 3
 *  2  |____| -> 1
 *  3  |____| -> 1
 *  4  |____|
 *
*/

// adjacent list
class Node {
    int adj;
    Node next;
    public Node(int data) {
        adj = data;
    }
}

abstract class Container {
    public abstract void add(int x);
    public abstract int remove();
    public abstract boolean isEmpty();
}

//廣度優先
class Queue extends Container {
    private int[] data;
    private int head, tail, size;
    public Queue() {
        data = new int[1000];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void add(int x) {
        // tail points to an empty slot
        data[tail++] = x;
        size++;
        if (tail >= data.length)
            tail = 0;
        return;
    }
    public int remove() {
        // head point to an available slot
        int v = data[head++];
        size --;
        if (head >= data.length)
            head = 0;
        return v;
    }
}

// 深度優先
class Stack extends Container {
    private int[] data;
    private int top;
    // top points to firest empty slot
    public Stack() {
        data = new int[1000];
    }
    public void add(int x) {
        data[top++] = x;
    }
    public int remove() {
        return data[--top];
    }
    public boolean isEmpty() {
        return top <= 0;
    }
}

public class Graph {
    private Node[] v;
    public Graph(int n) { // number of vertex in graph
        v = new Node[n];
    }
    // add a new edge(p, q) to this graph
    public void addEdge(int p, int q) {
        Node tmp = new Node(q);
        // push to list p
        // push: 加到最前面
        tmp.next = v[p];
        v[p] = tmp;
        // push to list q
        tmp = new Node(p);
        tmp.next = v[q];
        v[q] = tmp;
    }


    public void traversal(Container s) {
        // assum always begin from vertex number 0
        // init necessary data structure
        boolean visited[];
        visited = new boolean[v.length];
        // stack stores vertext to be processed
        s.add(0);
        while (!s.isEmpty()) {
            int visiting = s.remove();
            if (visited[visiting])
                continue;
            System.out.println(visiting);
            visited[visiting] = true;
            for (Node tmp = v[visiting]; tmp != null ; tmp = tmp.next) {
                s.add(tmp.adj);
            }
        }
    }

    public static void main(String[] argv) {
        Graph g = new Graph(9);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(1, 5);
        g.addEdge(2, 6);
        g.addEdge(3, 7);
        g.addEdge(3, 8);
        g.addEdge(5, 6);
        System.out.println("Using Stack");
        g.traversal(new Stack());
        System.out.println("Using Queue");
        g.traversal(new Queue());
    }
}
