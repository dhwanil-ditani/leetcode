class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int[][] graph = new int[26][26];

        for (int i=0; i<original.length; i++) {
            graph[original[i] - 'a'][changed[i] - 'a'] = cost[i];
        }

        for (int i=0; i<26; i++) {
            for (int j=0; j<26; j++) {
                System.out.print(graph[i][j] + "\t");
            }
            System.out.println();
        }

        return 0L;
    }
}

public class MinimumCostToConvertString1 {
    public static void main(String[] args) {
        String source = "abcd";
        String target = "acbe";
        char[] original = new char[]{'a','b','c','c','e','d'};
        char[] changed = new char[]{'b','c','b','e','b','e'};
        int[] cost = new int[]{2,5,5,1,2,20};

        new Solution().minimumCost(source, target, original, changed, cost);
    }
}