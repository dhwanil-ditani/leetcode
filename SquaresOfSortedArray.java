class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int head = 0, tail = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (head < tail) {
                if (Math.abs(nums[head]) > Math.abs(nums[tail])) {
                    result[i] = nums[head] * nums[head];
                    head++;
                } else {
                    result[i] = nums[tail] * nums[tail];
                    tail--;
                }
            } else {
                result[i] = nums[head] * nums[head];
            }
        }
        return result;
    }
}

public class SquaresOfSortedArray {
    public static void main(String[] args) {

    }
}