package P11.tugas_p11.no1;

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

    void addFirst(dataMahasiswa input) {
        node ndInput = new node(input, null);
        if (!isEmpty()) {
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
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

    void insertAfter(int key, dataMahasiswa input) {
        node ndInput = new node(input, null);
        node temp = head;
        while (temp != null) {
            if (temp.data.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, dataMahasiswa input) {
        if (index < 0) {
            System.out.println("Index tidak valid");
        } else if (index == 0) {
            addFirst(input);
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                } else {
                    System.out.println("Index melebihi batas");
                    return;
                }
            }
            if (temp != null) {
                temp.next = new node(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            } else {
                System.out.println("Index melebihi batas");
            }
        }
    }
}
