package bfs;

import bfs.algorithms.BFS;
import bfs.model.Graph;
import bfs.utils.GraphBuilder;

public class Application {
    public static void main(String[] args) {
        String paths = "AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7";

        Graph graph = GraphBuilder.graphBuilder(paths);

        BFS.getNumberOfTrips('A', 'C', graph);
    }
}