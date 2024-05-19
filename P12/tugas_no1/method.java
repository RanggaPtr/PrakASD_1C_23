package P12.tugas_no1;

public class method {
    Node head;
    int size;

    public method() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }
    
    void addFirst(dataPasien data) {
        Node newNode = new Node(null, data, head);
        head = newNode;
        if (head.next != null) {
            head.next.prev = newNode;
        }
        size++;
    }

    void addLast(dataPasien data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void print() {
        if (!isEmpty()) {
            Node current = head;
            System.out.println("|" + "\t" + "NO" + "\t" + "|" + "\t" + "NAMA" + "\t" + "|");
            while (current != null) {
                System.out.print("|" + "\t" + current.data.nomorAntri + "\t" + "|" + "\t" + current.data.nama + "\t"
                        + "|" + "\n");
                current = current.next;
            }
            System.out.println("\nSisa Antrian :" + size);
        } else {
            System.out.println("List is empty");
        }
    }
    
    public dataPasien getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

}
