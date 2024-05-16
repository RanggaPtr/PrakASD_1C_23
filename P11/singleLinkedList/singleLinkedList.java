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
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
            
        }
        node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                // node ndInput = new node(input, temp.next);
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    // void insertAt(int index, int input) {
    //     node ndInput = new node(input, null);
    //     if (index < 0) {
    //         System.out.println("perbaiki logikanya");
    //     } else if (index == 0) {
    //         addFirst(input);
    //     } else {
    //         node temp = head;
    //         for (int i = 0; i < index; i++) {
    //             temp = temp.next;
    //         }
    //         temp.next = new node(input, temp.next);
    //         if (temp.next.next == null) {
    //             tail = temp.next;
    //         }
    //     }
    // }
    
        void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Index tidak boleh negatif");
           
        }

        if (index == 0) {
            addFirst(input);
            
        }

        node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next== null) {
                System.out.println("Index melebihi panjang Linked List");
                
            }
            temp = temp.next;
        }

        if (temp != null) {
            node ndInput = new node(input, temp.next);
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        } else {
            System.out.println("Index melebihi panjang Linked List");
        }
    }
}
