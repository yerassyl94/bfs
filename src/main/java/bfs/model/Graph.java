package bfs.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
    HashMap<Character, List<Edge>> adjacencyList;

    public Graph(){
        this.adjacencyList = new HashMap<>();
    }

    public void addEdge(char source, char destination, int weight){
        if (!this.adjacencyList.containsKey(source)){
            this.adjacencyList.put(source, new ArrayList<>());
        }

        Edge edge = new Edge(destination, weight);
        this.adjacencyList.get(source).add(edge);
    }

    public List<Edge> getEdge(char key) {
        return this.adjacencyList.get(key);
    }
}
