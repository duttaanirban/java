package arrays;
import java.util.ArrayList;
import java.util.List;

public class RecursiveSearch {
    int[] array = {1, 2, 3, 4, 5, 6}; // Your array
    int target = 4; // Element to find
    List<Integer> foundElements = new ArrayList<>();
    
    public void search() {
        recursiveSearch(0);
    }
    
    private void recursiveSearch(int index) {
        // Base case: if index is out of bounds
        if (index >= array.length) {
            return;
        }

        // Check if the current element is the target
        if (array[index] == target) {
            foundElements.add(array[index]);
        }

        // Recursive call for the next index
        recursiveSearch(index + 1);
    }
    
    public List<Integer> getFoundElements() {
        return foundElements;
    }

    public static void main(String[] args) {
        RecursiveSearch search = new RecursiveSearch();
        search.search(); // Start the search
        System.out.println("Found elements: " + search.getFoundElements());
    }
}
