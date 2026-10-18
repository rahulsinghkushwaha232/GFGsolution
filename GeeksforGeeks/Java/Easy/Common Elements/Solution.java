import java.util.ArrayList;
import java.util.TreeMap;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Count frequencies of elements in array a
        TreeMap<Integer, Integer> mapA = new TreeMap<>();
        for (int num : a) {
            mapA.put(num, mapA.getOrDefault(num, 0) + 1);
        }

        // Count frequencies of elements in array b
        TreeMap<Integer, Integer> mapB = new TreeMap<>();
        for (int num : b) {
            mapB.put(num, mapB.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through the sorted keys and take the minimum frequency present in both arrays
        for (int key : mapA.keySet()) {
            if (mapB.containsKey(key)) {
                int commonCount = Math.min(mapA.get(key), mapB.get(key));
                for (int i = 0; i < commonCount; i++) {
                    result.add(key);
                }
            }
        }

        return result;
    }
}