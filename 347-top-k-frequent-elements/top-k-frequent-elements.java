import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>(); // Use a HashMap to store the count of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1); // Count the frequency of each element
        }
        
        // Create a list of map entries and sort them by their values (frequencies)
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(countMap.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey(); // Add the top k frequent elements to the result array
        }

        return result;
    }
}
