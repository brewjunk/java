import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class BinarySearch {
    
    public static void main(String[] args) {
        int[] data = IntStream.range(0, 2048).toArray();
        int target = 14;
        Map<String, Integer> Results = binarySearch(data, target);
        System.out.println("Result : " + Results);
    }

    private static Map<String, Integer> binarySearch(int[] data, int target) {

        int low = 0;
        int high = data.length-1;
        int comparisons = 0;
        Map<String, Integer> searchResults = new HashMap<>();
        searchResults.put("target", target);

        while ( low <= high ){
            comparisons += 1;
            int middle = low + (high-low)/2;
            if (data[middle] == target){
                searchResults.put("index", middle); 
                searchResults.put("comparisons", comparisons); 
                return searchResults;
            }
            if (data[middle] < target){
                low = middle + 1;
            } 
            if (data[middle] > target){
                high = middle - 1;
            }
        }
        // Target not found
        searchResults.put("index", -1); 
        searchResults.put("comparisons", comparisons); 
        return searchResults;

}

}
