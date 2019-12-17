package bfs.utils;

import bfs.model.Graph;

public class GraphBuilder {
    public static Graph graphBuilder(String edgeString){
        edgeString = edgeString.replaceAll(" ", "").toUpperCase();

        String[] edges = edgeString.split(",");

        Graph graph = new Graph();

        for (String edge: edges){
            graph.addEdge(edge.charAt(0), edge.charAt(1), Character.getNumericValue(edge.charAt(2)));
        }

        return graph;
    }
}
