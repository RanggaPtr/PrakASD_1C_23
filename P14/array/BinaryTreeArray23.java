package P14.array;

public class BinaryTreeArray23 {
    int[] data;
    int idxLast;

    public BinaryTreeArray23() {
        data = new int[10];
        idxLast = -1;
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    // TUGAS
    // 1
    void addNode(int value, int idxStart) {
        if (idxStart >= data.length) {
            // Resize the array if needed
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        if (data[idxStart] == 0) {
            data[idxStart] = value;
            idxLast = Math.max(idxLast, idxStart);
        } else if (value < data[idxStart]) {
            addNode(value, 2 * idxStart + 1);
        } else {
            addNode(value, 2 * idxStart + 2);
        }
    }

    // 2
    int findMin(int idxStart) {
        while (2 * idxStart + 1 <= idxLast && data[2 * idxStart + 1] != 0) {
            idxStart = 2 * idxStart + 1;
        }
        return data[idxStart];
    }

    int findMax(int idxStart) {
        while (2 * idxStart + 2 <= idxLast && data[2 * idxStart + 2] != 0) {
            idxStart = 2 * idxStart + 2;
        }
        return data[idxStart];
    }

    // 3
    void printLeafNodes(int idxStart) {
        if (idxStart > idxLast || data[idxStart] == 0) {
            return;
        }
        if ((2 * idxStart + 1 > idxLast || data[2 * idxStart + 1] == 0) &&
                (2 * idxStart + 2 > idxLast || data[2 * idxStart + 2] == 0)) {
            System.out.print(data[idxStart] + " ");
        } else {
            printLeafNodes(2 * idxStart + 1);
            printLeafNodes(2 * idxStart + 2);
        }
    }

    // 4
    int countLeafNodes(int idxStart) {
        if (idxStart > idxLast || data[idxStart] == 0) {
            return 0;
        }
        if ((2 * idxStart + 1 > idxLast || data[2 * idxStart + 1] == 0) &&
                (2 * idxStart + 2 > idxLast || data[2 * idxStart + 2] == 0)) {
            return 1;
        } else {
            return countLeafNodes(2 * idxStart + 1) + countLeafNodes(2 * idxStart + 2);
        }
    }

    // 5
    void add(int value) {
        addNode(value, 0);
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
