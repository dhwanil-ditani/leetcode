import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        int max = Collections.max(freq.values());
        int result = 0;
        for (int i : freq.values()) {
            if (i == max) {
                result += max;
            }
        };

        return result;
    }
}

public class CountElementsWithMaximumFrequency {

}
