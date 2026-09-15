package Recursion.FAQs_Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Problem: Rat in a Maze

    Given a grid of dimensions n x n. A rat is placed at coordinates (0, 0) and wants to reach at coordinates (n-1, n-1).
    Find all possible paths that rat can take to travel from (0, 0) to (n-1, n-1). 
    The directions in which rat can move are 'U' (up) , 'D' (down) , 'L' (left) , 'R' (right).
    The value 0 in grid denotes that the cell is blocked and rat cannot use that cell for travelling, 
    whereas value 1 represents that rat can travel through the cell. If the cell (0, 0) has 0 value, then mouse cannot move to any other cell.

    Note :
    In a path no cell can be visited more than once.
    If there is no possible path then return empty vector.

    Example 1
    Input : n = 4 , grid = [ [1, 0, 0, 0] , [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1] ]
    Output : [ "DDRDRR" , "DRDDRR" ]
    Explanation : The rat has two different path to reach (3, 3).
    The first path is (0, 0) => (1, 0) => (2, 0) => (2, 1) => (3, 1) => (3, 2) => (3, 3).
    The second path is (0,0) => (1,0) => (1,1) => (2,1) => (3,1) => (3,2) => (3,3).

    Example 2
    Input : n = 2 , grid = [ [1, 0] , [1, 0] ]
    Output : -1
    Explanation : There is no path that rat can choose to travel from (0,0) to (1,1).
*/
public class RatInAMaze {
    public static void main(String[] args) {
        // Input : n = 4 , grid = [ [1, 0, 0, 0] , [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1] ]
        int[][] grid1 = { {1, 0, 0, 0} , {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1} };
        System.out.println(findPath(grid1));

        // Input : n = 2 , grid = [ [1, 0] , [1, 0] ]
        int[][] grid2 = {{1, 0} , {1, 0}};
        System.out.println(findPath(grid2));
    }

    static List<String> ans;
    public static List<String> findPath(int[][] grid) {
        //your code goes here
        ans = new ArrayList<>();
        int n = grid.length;
        
        ans.clear();

        if (grid[0][0] == 0 || grid[n - 1][n - 1] == 0) return ans;

        func(grid, "", 0, 0, n);

        Collections.sort(ans);

        return ans;
    }

    public static void func(int[][] grid, String str, int i, int j, int n) {

        if(i == n-1 && j == n-1) {
            ans.add(str);
            return;
        }

        if (grid[i][j] == 0) return;

        grid[i][j] = 0; // marking visited

        // up
        if(i > 0) func(grid, str + 'U', i-1, j, n);

        // left
        if(j > 0) func(grid, str + 'L', i, j-1, n);

        // down
        if(i < n-1) func(grid, str + 'D', i+1, j, n);

        // right
        if(j < n-1) func(grid, str + 'R', i, j+1, n);

        // Unmark cell as visited by setting it to 1
        grid[i][j] = 1;
    }
}
