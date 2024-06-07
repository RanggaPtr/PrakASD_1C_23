package P15;

import java.util.Scanner;

public class graph23 {
    int vertex;
    doubleLinkedList23 list[];

    public graph23(int v) {
        vertex = v;
        list = new doubleLinkedList23[v];
        for (int i = 0; i < v; i++) {
            list[i] = new doubleLinkedList23();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
        }
        for (int j = 0; j < list[asal].size(); j++) {
            totalOut++;
        }

        System.out.println("InDegree dari gedung " + (char) ('A' + asal) + " = " + totalIn);
        System.out.println("OutDegree dari gedung " + (char) ('A' + asal) + " = " + totalOut);
        System.out.println("Degree dari gedung " + (char) ('A' + asal) + " = " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int j = 0; j < list[asal].size(); j++) {
            if (list[asal].get(j) == tujuan) {
                list[asal].remove(j);
                return;
            }
        }
    }

    public void updateJarak(int asal, int tujuan, int newJarak) throws Exception {
        for (int j = 0; j < list[asal].size(); j++) {
            if (list[asal].get(j) == tujuan) {
                list[asal].updateJarak(j, newJarak);
                return;
            }
        }
        throw new Exception("Edge not found");
    }

    public void removeAllEdges() throws Exception {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " Terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean isPath(int asal, int tujuan) {
        boolean[] visited = new boolean[vertex];
        return isPathDFS(asal, tujuan, visited);
    }

    private boolean isPathDFS(int current, int tujuan, boolean[] visited) {
        if (current == tujuan) {
            return true;
        }

        visited[current] = true;

        for (int i = 0; i < list[current].size(); i++) {
            int neighbor;
            try {
                neighbor = list[current].get(i);
                if (!visited[neighbor]) {
                    if (isPathDFS(neighbor, tujuan, visited)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public int hitungEdge() {
        int edgeCount = 0;
        for (int i = 0; i < vertex; i++) {
            edgeCount += list[i].size();
        }
        return edgeCount;
    }
}