class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] charArray = s.toCharArray();
        int ones = 0;

        for (int i = 0; i < s.length(); i++) {
            if (charArray[i] == '1') {
                ones += 1;
                charArray[i] = '0';
            }
        }

        charArray[s.length() - 1] = '1';
        ones -= 1;

        for (int i = 0; i < ones; i++) {
            charArray[i] = '1';
        }

        return new String(charArray);
    }
}

public class MaximumOddBinaryNumber {
    public static void main(String[] args) {

    }
}
