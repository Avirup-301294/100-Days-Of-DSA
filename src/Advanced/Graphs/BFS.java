package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        // Adjacency List

        /*
            1 -> [2,6]
            2 -> [1, 3, 4]
            3 -> [2, 5]
            4 -> [2, 5]
            5 -> [3, 4]
            6 -> [1, 7, 8]
            7 -> [6]
            8 -> [6]
         */
        int n = 5;
        Graph graph = new Graph(n);

        // Adding undirected edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("Undirected Graph Adjacency List:");
        graph.printGraph();
        ArrayList<Integer> bfsList = bfsTraversal(n, graph.getAdjList());
        System.out.println(bfsList);
    }

    private static ArrayList<Integer> bfsTraversal(int n, ArrayList<ArrayList<Integer>> adjacencyList) {

        boolean[] visited = new boolean[n+1];
        ArrayList<Integer> bfsList = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;

        while(!queue.isEmpty()) {
            Integer node = queue.poll();
            bfsList.add(node);

            for(Integer el : adjacencyList.get(node)) {
                if(!visited[el]) {
                    visited[el] = true;
                    queue.offer(el);
                }
            }
        }

        return bfsList;
    }
}

/*
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        int n = 8;
        for(int i = 1; i <= n+1; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        adjacencyList.get(1).add(2);
        adjacencyList.get(1).add(6);

        adjacencyList.get(2).add(1);
        adjacencyList.get(2).add(3);
        adjacencyList.get(2).add(4);

        adjacencyList.get(3).add(2);
        adjacencyList.get(3).add(5);

        adjacencyList.get(4).add(2);
        adjacencyList.get(4).add(5);

        adjacencyList.get(5).add(3);
        adjacencyList.get(5).add(4);

        adjacencyList.get(6).add(1);
        adjacencyList.get(6).add(7);
        adjacencyList.get(6).add(8);

        adjacencyList.get(7).add(6);
        adjacencyList.get(8).add(6);

        System.out.println(adjacencyList);

 */