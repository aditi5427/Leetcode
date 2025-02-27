import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) { // Corrected method name
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for (int freq : freqMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int finalCount = 0;
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) == maxFreq) {
                finalCount += freqMap.get(key);
            }
        }

        return finalCount;
    }
}