import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        Arrays.sort(tokens);
        int start = 0, end = tokens.length-1;

        if (start < tokens.length && power < tokens[start]) {
            return score;
        }

        while (start < end) {
            if (power >= tokens[start]) {
                power -= tokens[start];
                score += 1;
                start += 1;
            } else {
                power += tokens[end];
                score -= 1;
                end -= 1;
            }
        }

        if (start < tokens.length && power >= tokens[start]) {
            power -= tokens[start];
            score += 1;
            start += 1;
        }

        return score;
    }
}

public class BagOfTokens {
    public static void main(String[] args) {
        
    }
}
