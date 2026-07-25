package Graphs;

import java.util.*;

public class Graph {
    private ArrayList<ArrayList<Integer>> adjList;

    public Graph(int vertices) {
        adjList = new ArrayList<>();
        // Initialize adjacency list for all vertices
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Adds an undirected edge between two vertices
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    // Adds a directed edge from u to v
    public void addDirectedEdge(int u, int v) {
        adjList.get(u).add(v);
    }

    // Prints the adjacency list
    public void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> getAdjList() {
        return adjList;
    }
}