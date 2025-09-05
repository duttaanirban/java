import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        //allpaths("", board, 0, 0);
        allpathsPrint("", board, 0, 0, new int[board.length][board[0].length], 1);
    }

    static void allpaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p); // Print the path when reaching the bottom-right corner
            return;
        }

        if (!maze[r][c]) {
            return; // If the cell is blocked, return
        }

        // Mark the cell as visited
        maze[r][c] = false;

        // Move down
        if (r < maze.length - 1) {
            allpaths(p + "D", maze, r + 1, c);
        }
        // Move right
        if (c < maze[0].length - 1) {
            allpaths(p + "R", maze, r, c + 1);
        }
        // Move up
        if (r > 0) {
            allpaths(p + "U", maze, r - 1, c);
        }
        // Move left
        if (c > 0) {
            allpaths(p + "L", maze, r, c - 1);
        }

        // Unmark the cell for other paths
        maze[r][c] = true;
    }

    static void allpathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
               System.out.println(Arrays.toString(arr));
            }
            System.out.println(p); // Print the path when reaching the bottom-right corner
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return; // If the cell is blocked, return
        }

        // Mark the cell as visited
        maze[r][c] = false;

        path[r][c] = step;

        // Move down
        if (r < maze.length - 1) {
            allpathsPrint(p + "D", maze, r + 1, c, path, step + 1);
        }
        // Move right
        if (c < maze[0].length - 1) {
            allpathsPrint(p + "R", maze, r, c + 1, path, step + 1);
        }
        // Move up
        if (r > 0) {
            allpathsPrint(p + "U", maze, r - 1, c, path, step + 1);
        }
        // Move left
        if (c > 0) {
            allpathsPrint(p + "L", maze, r, c - 1, path, step + 1);
        }

        // Unmark the cell for other paths
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
