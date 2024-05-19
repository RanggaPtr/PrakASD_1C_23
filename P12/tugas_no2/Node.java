package P12.tugas_no2;

public class Node {
    dataFilm data;
    Node prev, next;

    public Node(Node prev, dataFilm data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
