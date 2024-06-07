package P15.percobaan2;

import java.util.Scanner;

public class graphMatrix23 {
    int vertex;
    int  matrix[][];

    public graphMatrix23(int v) {
        vertex = v;
        matrix = new int[v][v];
        // Inisialisasi matrix dengan nilai -1 untuk menandakan tidak ada edge
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matrix[i][j] = -1;
            }
        }
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matrix[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        matrix[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + " Terhubung dengan : ");
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] != -1) {
                    System.out.println("Gedung " + (char) ('A' + j) + " dengan jarak " + matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    // Metode untuk menghitung outDegree
    public int outDegree(int v) {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            if (matrix[v][i] != -1) {
                count++;
            }
        }
        return count;
    }

    // Metode untuk menghitung inDegree
    public int inDegree(int v) {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            if (matrix[i][v] != -1) {
                count++;
            }
        }
        return count;
    }
}