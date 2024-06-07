package P15;

import java.util.*;

public class graphMain23 {
    public static void main(String[] args) throws Exception {
        // graph23 g = new graph23(6);
        // g.addEdge(0, 1, 50);
        // g.addEdge(0, 2, 100);
        // g.addEdge(1, 3, 70);
        // g.addEdge(2, 3, 40);
        // g.addEdge(3, 4, 60);
        // g.addEdge(4, 5, 80);
        // g.degree(0);
        // g.printGraph();
        // g.removeEdge(1, 3);
        // g.printGraph();

        // checkPath(g, 2, 3); // C to D
        // checkPath(g, 2, 5); // C to F

        Scanner sc = new Scanner(System.in);
        graph23 g = new graph23(6);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Check Path");
            System.out.println("6. Update Distance");
            System.out.println("7. Count Edges");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter source (0-5): ");
                    int source = sc.nextInt();
                    System.out.print("Enter destination (0-5): ");
                    int destination = sc.nextInt();
                    System.out.print("Enter distance: ");
                    int distance = sc.nextInt();
                    g.addEdge(source, destination, distance);
                    break;

                case 2:
                    System.out.print("Enter source (0-5): ");
                    source = sc.nextInt();
                    System.out.print("Enter destination (0-5): ");
                    destination = sc.nextInt();
                    g.removeEdge(source, destination);
                    break;

                case 3:
                    System.out.print("Enter vertex (0-5): ");
                    int vertex = sc.nextInt();
                    g.degree(vertex);
                    break;

                case 4:
                    g.printGraph();
                    break;

                case 5:
                    System.out.print("Enter source (0-5): ");
                    source = sc.nextInt();
                    System.out.print("Enter destination (0-5): ");
                    destination = sc.nextInt();
                    checkPath(g, source, destination);
                    break;

                case 6:
                    System.out.print("Enter source (0-5): ");
                    source = sc.nextInt();
                    System.out.print("Enter destination (0-5): ");
                    destination = sc.nextInt();
                    System.out.print("Enter new distance: ");
                    int newDistance = sc.nextInt();
                    g.updateJarak(source, destination, newDistance);
                    break;
                case 7:
                    int edgeCount = g.hitungEdge();
                    System.out.println("Total edges in the graph: " + edgeCount);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 8);

        sc.close();
    }

    private static void checkPath(graph23 g, int asal, int tujuan) {
        if (g.isPath(asal, tujuan)) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        } else {
            System.out
                    .println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        }
    }
}
