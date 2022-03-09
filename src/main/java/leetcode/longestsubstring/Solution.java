package leetcode.longestsubstring;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String text = "pwwkew";

        System.out.println(solution.lengthOfLongestSubstring(text));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String[] chars = s.split("");
        for (int i = 0; i < s.length(); i++) {
            HashSet<String> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {
                if (!set.add(chars[j])) {
                    break;
                }
            }
            if (set.size() > max) {
                max = set.size();
            }

        }
        return max;
    }
}
