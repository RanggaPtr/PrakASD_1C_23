package P12.tugas_no2;

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

    void addFirst(dataFilm data) {
        Node newNode = new Node(null, data, head);
        head = newNode;
        if (head.next != null) {
            head.next.prev = newNode;
        }
        size++;
    }

    void addLast(dataFilm data) {
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

    void add(dataFilm data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            addFirst(data);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(current, data, current.next);
            if (current.next != null) {
                current.next.prev = newNode;
            }
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

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    void print() {
        if (!isEmpty()) {
            Node current = head;
            System.out.println("| ID    | JUDUL FILM         | RATING |");
            while (current != null) {
                System.out.printf("| %5d | %-20s | %6.2f |\n", current.data.id, current.data.judulFilm,
                        current.data.rating);
                current = current.next;
            }

            System.out.println("\nSisa Antrian :" + size);
        } else {
            System.out.println("List is empty");
        }
    }

    public Node searchByID(int id) {
        Node current = head;
        while (current != null) {
            if (current.data.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void bubbleSort() {
        boolean swapped;
        Node current;
        Node last = null;

        if (head == null) {
            return;
        }

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data.id > current.next.data.id) {
                    dataFilm temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    public void selectionSort() {
        if (head == null) {
            return;
        }

        Node current = head;

        while (current.next != null) {
            Node min = current;
            Node r = current.next;

            while (r != null) {
                // yang menentukan asc desc klo ini desc
                if (min.data.id < r.data.id) {
                    min = r;
                }
                r = r.next;
            }

            dataFilm temp = current.data;
            current.data = min.data;
            min.data = temp;

            current = current.next;
        }
    }

    public void insertionSort() {
        if (head == null || head.next == null) {
            return;
        }

        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            sorted = sortedInsert(sorted, current);
            current = nextNode;
        }

        head = sorted;
    }

    private Node sortedInsert(Node sorted, Node newNode) {
        if (sorted == null || sorted.data.id >= newNode.data.id) {
            newNode.next = sorted;
            return newNode;
        } else {
            Node current = sorted;
            while (current.next != null && current.next.data.id < newNode.data.id) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            return sorted;
        }
    }

    // public dataFilm getFirst() throws Exception {
    // if (isEmpty()) {
    // throw new Exception("Linked List Kosong");
    // }
    // return head.data;
    // }

    // public dataFilm getLast() throws Exception {
    // if (isEmpty()) {
    // throw new Exception("Linked List Kosong");
    // }
    // Node current = head;
    // while (current.next != null) {
    // current = current.next;
    // }
    // return current.data;
    // }

    // public dataFilm get(int index) throws Exception {
    // if (isEmpty() || index >= size) {
    // throw new Exception("Nilai indeks diluar batas");
    // }
    // Node current = head;
    // for (int i = 0; i < index; i++) {
    // current = current.next;
    // }
    // return current.data;
    // }

}
