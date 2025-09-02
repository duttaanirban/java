
import java.util.ArrayList;

public class countingPaths {
    public static void main(String[] args) {
        //System.out.println(count(3, 3));
        //System.out.println(pathWithDiagonal("", 3, 3)); // Call the path function to print all paths from (3, 3) to (1, 1)
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        pathrest("", board, 0, 0);
    
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1; // Base case: if either row or column is 1, there's only one path
        }

        int left = count (r-1, c);
        int right = count(r, c-1);
        return left + right; // Sum of paths from left and top cells
    }

    static ArrayList<String> path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p); // Base case: if we reach (1, 1), add the path to the list
            return list; // Print the path
        }

        ArrayList<String> list = new ArrayList<>();
        
        if (r > 1) {
            list.addAll(path(p + "D", r - 1, c)); // Move down
        }
        if (c > 1) {
            list.addAll(path(p + "R", r, c - 1)); // Move right
        }
        return list; // Return the list of paths
    }

    static ArrayList<String> pathWithDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p); // Base case: if we reach (1, 1), add the path to the list
            return list; // Print the path
        }

        ArrayList<String> list = new ArrayList<>();
        
        if (r > 1 && c > 1) {
            list.addAll(pathWithDiagonal(p + "D", r - 1, c - 1)); // Move diagonally down-right
        }

        if (r > 1) {
            list.addAll(pathWithDiagonal(p + "V", r - 1, c)); // Move down
        }
        if (c > 1) {
            list.addAll(pathWithDiagonal(p + "R", r, c - 1)); // Move right
        }
        return list; // Return the list of paths
    }

    static void pathrest(String p, boolean[][] maze, int r, int c) {
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
            pathrest(p + "D", maze, r + 1, c);
        }
        // Move right
        if (c < maze[0].length - 1) {
            pathrest(p + "R", maze, r, c + 1);
        }
        
        // Unmark the cell for other paths
        maze[r][c] = true;
    }

}

