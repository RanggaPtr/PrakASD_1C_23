package P15;

public class graphMain23 {
    public static void main(String[] args) throws Exception {
        graph23 g = new graph23(6);
        g.addEdge(0, 1, 50);
        g.addEdge(0, 2, 100);
        g.addEdge(1, 3, 70);
        g.addEdge(2, 3, 40);
        g.addEdge(3, 4, 60);
        g.addEdge(4, 5, 80);
        g.degree(0);
        g.printGraph();
        g.removeEdge(1, 3);
        g.printGraph();
    }
}
