package Recursion.FAQs.Hard;

import java.util.*;

public class MColoring {
    List<List<Integer>> adj;
    int M;
    int N;
    boolean graphColoring(int[][] edges, int m, int n) {
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

    private boolean graphColoringHelper(int node, int[] colors) {
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

    private boolean canAddColors(int index, int node, int[] colors) {
        for(int neighbour: adj.get(node)) {
            if(colors[neighbour] == index) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        MColoring mColoring = new MColoring();
        int m = 3, n = 4; // m - colors ; n - vertices
        int[][] edges = {
                {0,1}, {1,2}, {2,3}, {3,0}, {0,2}
        };

        System.out.println(mColoring.graphColoring(edges, m, n));
    }
}
