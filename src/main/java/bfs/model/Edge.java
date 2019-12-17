package bfs.model;

public class Edge {
    char destination;
    int weight;

    public Edge(char destination, int weight){
        this.destination = destination;
        this.weight = weight;
    }

    public char getDestination() {
        return destination;
    }

    public void setDestination(char destination) {
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
