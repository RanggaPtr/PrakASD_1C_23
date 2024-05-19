package P12.tugas_no1;

public class Node {
    dataPasien data;
    Node prev, next;

    public Node(Node prev, dataPasien data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
