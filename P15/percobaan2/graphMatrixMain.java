package P15.percobaan2;

public class graphMatrixMain {

    public static void main(String[] args) throws Exception {
        graphMatrix23 g = new graphMatrix23(4);
        g.makeEdge(0, 1, 50);
        g.makeEdge(1, 0, 60);
        g.makeEdge(1, 2, 70);
        g.makeEdge(2, 1, 80);
        g.makeEdge(2, 3, 40);
        g.makeEdge(3, 0, 90);
        g.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        g.removeEdge(2, 1);
        g.printGraph();

        // Mencetak derajat (degree) dari masing-masing simpul
        for (int i = 0; i < 4; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + " memiliki outDegree: " + g.outDegree(i));
            System.out.println("Gedung " + (char) ('A' + i) + " memiliki inDegree: " + g.inDegree(i));
        }

        System.out.println("Hasil setelah penghapusan edge");
        g.removeEdge(2, 1);
        g.printGraph();

        // Mencetak kembali derajat (degree) setelah penghapusan edge
        for (int i = 0; i < 4; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + " memiliki outDegree: " + g.outDegree(i));
            System.out.println("Gedung " + (char) ('A' + i) + " memiliki inDegree: " + g.inDegree(i));
        }
    }
}
