package P11.singleLinkedList;

public class singleLinkedList {
    node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.print("Isi Linked List" + "\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }

            System.out.println(" ");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        node ndInput = new node(input, null);
        if (!isEmpty()) {
            // head = ndInput;
            // tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        } else {
            System.out.println("linked list anda masih kosong");
            head = ndInput;
            tail = ndInput;
            // ndInput.next = head;
            // head = ndInput;
        }
    }

    void addLast(int input) {
        node ndInput = new node(input, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            System.out.println("linked list anda masih kosong");
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        node ndInput = new node(input, null);
        node temp = head;
        do {
            if (temp.data == key) {
                // node ndInput = new node(input, temp.next);
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        node ndInput = new node(input, null);
        if (index < 0) {
            System.out.println("perbaiki logikanya");
        } else if (index == 0) {
            addFirst(input);
        } else {
            node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = new node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    
    
    
    int getData(int index) {
        node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key) {
        node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return 1;
        } else {
            return index;
        }
    }
    
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    
    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong");
        } else if (head != tail) {
            head = tail = null;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }
    
    void remove(int key) {
        if (isEmpty()) {
            System.out.println("LinkedList masih kosong");
        } else {
            node temp = head;
            while (temp != null) {
                if (temp.data != key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    void removeAt(int index) {
        if (index==0) {
            remove(index);
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next==null) {
                tail = temp;
            }
        }
    }
}
