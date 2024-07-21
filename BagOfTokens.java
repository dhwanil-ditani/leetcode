import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        Arrays.sort(tokens);
        int start = 0, end = tokens.length-1;

        while (start <= end) {
            if (power >= tokens[start]) {
                score++;
                power -= tokens[start];
                start++;
            } else if (start < end && score > 0) {
                score--;
                power += tokens[end];
                end--;
            } else {
                return score;
            }
        }

        return score;
    }
}

/**
 * URL: https://leetcode.com/problems/bag-of-tokens/
 */
public class BagOfTokens {
    public static void main(String[] args) {
        int power = 200;
        int[] tokens = new int[]{100, 200, 300, 400};

        System.out.println(new Solution().bagOfTokensScore(tokens, power));
    }
}
