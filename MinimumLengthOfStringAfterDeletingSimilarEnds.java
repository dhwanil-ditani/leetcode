class Solution {
    public int minimumLength(String s) {
        char[] sArray = s.toCharArray();
        int length = s.length();
        int head = 0, tail = length-1;

        while (head < tail && sArray[head] == sArray[tail]) {
            while (head < tail && sArray[head] == sArray[head+1]) {
                head++;
                length--;
            }

            while (tail > head && sArray[tail] == sArray[tail-1]) {
                tail--;
                length--;
            }

            head++;
            tail--;
            length--;
            length--;
        }
        if (length < 0) {
            return 0;
        }
        return length;
    }
}

/**
 * MinimumLengthOfStringAfterDeletingSimilarEnds
 */
public class MinimumLengthOfStringAfterDeletingSimilarEnds {

    
}