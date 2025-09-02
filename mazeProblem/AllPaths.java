public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        allpaths("", board, 0, 0);
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
}
