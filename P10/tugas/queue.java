package P10.tugas;

public class queue {
    pembeli[] data;
    int front;
    int rear;
    int size;
    int max;
    pembeli[] riwayatPembeli;
    int riwayatFront;
    int riwayatRear;
    int riwayatSize;

    public queue(int n) {
        max = n;
        data = new pembeli[max];
        size = 0;
        front = rear = -1;
        riwayatPembeli = new pembeli[max];
        riwayatSize = 0;
        riwayatFront = riwayatRear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Element terdepan :" + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Element terbelakang :" + data[rear]);
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
                System.out.println(data[i]);
                i = (i + 1) % max;
            }
            System.out.println(data[i]);
            System.out.println("Jumlah elemen :" + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(pembeli dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
            tambahRiwayat(dt);
        }
    }

    public pembeli dequeue() {
        pembeli dt = null;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return dt;
    }

    private void tambahRiwayat(pembeli dt) {
        if (riwayatSize == 0) {
            riwayatFront = riwayatRear = 0;
        } else {
            riwayatRear = (riwayatRear + 1) % max;
        }
        riwayatPembeli[riwayatRear] = dt;
        riwayatSize++;
    }

    public void daftarPembeli() {
        System.out.println("Daftar Pembeli:");
        if (riwayatSize == 0) {
            System.out.println("Tidak ada riwayat pembeli");
        } else {
            int i = riwayatFront;
            while (i != riwayatRear) {
                System.out.println(riwayatPembeli[i]);
                i = (i + 1) % max;
            }
            System.out.println(riwayatPembeli[i]);
        }
    }

    public void peekPosition(String nama) {
        boolean found = false;
        for (int i = front; i <= rear; i++) {
            if (data[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Posisi " + nama + " adalah " + (i - front + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Pembeli dengan nama " + nama + " tidak ditemukan");
        }
    }

    public static void menu() {
        System.out.println("Pilih Menu :");
        System.out.println("1. Tambahkan Antrian");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek semua antrian");
        System.out.println("4. Cek antrian terdepan");
        System.out.println("5. Clear");
        System.out.println("6. Peek Rear");
        System.out.println("7. Daftar Pembeli");
        System.out.println("8. Peek Position");
        System.out.println("=====================");
    }
}
