import java.util.*;

public class GraphB {
    // adgecency list
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {

        int vertex = 5;
        ArrayList<Edge>[] graph = new ArrayList[vertex]; // null->empty arrayList

        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        // index - 0
        graph[0].add(new Edge(0, 1, 5));

        // index - 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // index - 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // index - 3
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));

        // index - 4
        graph[4].add(new Edge(4, 2, 2));

        // 2's neightbours information
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i); // src, dest, wt
            System.out.println(e.dest);
        }
    }
}
