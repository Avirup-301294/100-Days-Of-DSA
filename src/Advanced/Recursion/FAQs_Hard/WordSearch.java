package Recursion.FAQs_Hard;
/*
    Problem: Word Search
    Given a grid of n x m dimension grid of characters board and a string word.
    The word can be created by assembling the letters of successively surrounding cells, whether they are next to each other vertically or horizontally. It is forbidden to use the same letter cell more than once.

    Return true if the word exists in the grid otherwise false.

    Example 1
    Input : board = [ ["A", "B", "C", "E"] , ["S" ,"F" ,"C" ,"S"] , ["A", "D", "E", "E"] ] , word = "ABCCED"
    Output : true
    Explanation : The word is coloured in yellow.
*/
public class WordSearch {
    public static void main(String[] args) {
        // Input : board = [ ["A", "B", "C", "E"] , ["S" ,"F" ,"C" ,"S"] , ["A", "D", "E", "E"] ] , word = "ABCCED"
        char[][] board1 = {
            {'A', 'B', 'C', 'E'},
            {'S' ,'F' ,'C' ,'S'},
            {'A', 'D', 'E', 'E'},
        };

        String word1 = "ABCCED";
        System.out.println(exist(board1, word1));

        // Input : board = [["A", "B", "C", "E"] , ["S", "F", "C", "S"] , ["A", "D", "E", "E"]] , word = "SEE"
        char[][] board2 = {
            {'A', 'B', 'C', 'E'},
            {'S' ,'F' ,'C' ,'S'},
            {'A', 'D', 'E', 'E'},
        };

        String word2 = "ABCCED";
        System.out.println(exist(board2, word2));
    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (func(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean func(char[][] board, int i, int j, String word, int k) {
        if (k == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
                || word.charAt(k) != board[i][j]) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean ans = false;
        ans |= func(board, i + 1, j, word, k + 1);
        ans |= func(board, i - 1, j, word, k + 1);
        ans |= func(board, i, j + 1, word, k + 1);
        ans |= func(board, i, j - 1, word, k + 1);
        board[i][j] = temp;
        return ans;
    }
}