package P11.tugas_p11.no2;

public class singleLinkedList {
    node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data.nama + " (" + tmp.data.nim + ") -> ");
                tmp = tmp.next;
            }
            System.out.println("null");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addLast(dataMahasiswa input) {
        node ndInput = new node(input, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    // void removeLast() {
    // if (isEmpty()) {
    // System.out.println("Linked List Masih Kosong");
    // } else if (head == tail) {
    // head = tail = null;
    // } else {
    // node temp = head;
    // while (temp.next != tail) {
    // temp = temp.next;
    // }
    // temp.next = null;
    // tail = temp;
    // }
    // }

}
