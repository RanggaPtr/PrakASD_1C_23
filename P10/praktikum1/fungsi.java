package P10.praktikum1;

import P8.barang23;

public class fungsi {
    queue[] q;
    int front;
    int rear;
    int size;
    int max;
    int data;

    public fungsi(int kapasitas) {
        size = kapasitas;
        q = new queue[size];
        front = rear = -1;
    }    
    
}
