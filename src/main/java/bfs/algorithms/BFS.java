package bfs.algorithms;

import bfs.model.Edge;
import bfs.model.Graph;

import java.util.*;

public class BFS {
    public static void getNumberOfTrips(char source, char destination, Graph graph){
        Queue<List<Character>> queue = new LinkedList<>();

        List<Character> start = new ArrayList<>();
        start.add(source);
        queue.add(start);

        while(!queue.isEmpty()){
            List<Character> path = queue.poll();
            char last = path.get(path.size() - 1);

            for (Edge edge : graph.getEdge(last)){
                if (!path.contains(edge.getDestination())){
                    List<Character> newPath = new ArrayList<>(path);
                    newPath.add(edge.getDestination());
                    queue.add(newPath);
                }

                if (edge.getDestination() == destination){
                    System.out.println(path);
                }
            }
        }
    }
}
