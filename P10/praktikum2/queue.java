package P10.praktikum2;

public class queue {
    nasabah[] data;
    int front;
    int rear;
    int size;
    int max;

    public queue(int n) {
        max = n;
        data = new nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {

        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Element terdepan :" + data[front].noRek+" "+data[front].nama+" "+data[front].alamat+" "+data[front].umur+" "+data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Element terbelakang :" + data[rear].noRek+" "+data[rear].nama+" "+data[rear].alamat+" "+data[rear].umur+" "+data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].noRek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                        + data[i].saldo);;
                i = (i + 1) % max;
            }
            System.out.println(data[i].noRek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                    + data[i].saldo);
            System.out.println("Jumlah elemen :" + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong bozz");
        }
    }

    public void enqueue(nasabah dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public nasabah dequeue() {
        nasabah dt = new nasabah(null, null, null, max, front);
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public static void menu() {
        System.out.println("Pilih Menu :");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. cek semua antrian");
        System.out.println("4. cek antrian terdepan");
        System.out.println("5. Clear");
        System.out.println("6. Peek Rear");
        System.out.println("=====================");
    }
}
