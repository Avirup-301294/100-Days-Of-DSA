package Recursion.FAQs_Hard;

import java.util.ArrayList;
import java.util.List;

/*
    Problem: M Coloring Problem
    Given an integer M and an undirected graph with N vertices (zero indexed) and E edges. 
    The goal is to determine whether the graph can be coloured with a maximum of M colors so that 
    no two of its adjacent vertices have the same colour applied to them.

    In this context, colouring a graph refers to giving each vertex a different colour. 
    If the colouring of vertices is possible then return true, otherwise return false.


    Example 1
    Input : N = 4 , M = 3 , E = 5 , Edges = [ (0, 1) , (1, 2) , (2, 3) , (3, 0) , (0, 2) ]
    Output : true
    Explanation : Consider the three colors to be red, green, blue.
    We can color the vertex 0 with red, vertex 1 with blue, vertex 2 with green, vertex 3 with blue.
    In this way we can color graph using 3 colors at most.

    Example 2
    Input : N = 3 , M = 2 , E = 3 , Edges = [ (0, 1) , (1, 2) , (0, 2) ]
    Output : false
    Explanation : Consider the two colors to be red, green.
    We can color the vertex 0 with red, vertex 1 with green.
    As the vertex 2 is adjacent to both vertex 1 and 0 , so we cannot color with red and green.
    Hence as we could not color all vertex of graph we return false.
*/
public class MColoringProblem {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> adj;
    static int M;
    static int N;
    public static boolean graphColoring(int[][] edges, int m, int n) {
        // Create the Adj List
        adj = new ArrayList<>();
        M = m;
        N = n;
        for(int i = 0 ; i < N; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] colors = new int[n];

        return graphColoringHelper(0, colors);

    }

    private static boolean graphColoringHelper(int node, int[] colors) {
        if(node == N) return true;
        for(int i = 1; i <= M; i++) {
            if(canAddColors(i, node, colors)) {
                colors[node] = i;
                if(graphColoringHelper(node+1, colors)) return true;
                colors[node] = 0;
            }
        }
        return false;
    }

    private static boolean canAddColors(int index, int node, int[] colors) {
        for(int neighbour: adj.get(node)) {
            if(colors[neighbour] == index) return false;
        }

        return true;
    }
}
